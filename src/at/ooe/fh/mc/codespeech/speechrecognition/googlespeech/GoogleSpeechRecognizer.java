package at.ooe.fh.mc.codespeech.speechrecognition.googlespeech;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

import com.google.api.gax.rpc.ClientStream;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.StreamController;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.cloud.speech.v1.SpeechClient;
import com.google.cloud.speech.v1.SpeechRecognitionAlternative;
import com.google.cloud.speech.v1.StreamingRecognitionConfig;
import com.google.cloud.speech.v1.StreamingRecognitionResult;
import com.google.cloud.speech.v1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1.StreamingRecognizeResponse;
import com.google.protobuf.ByteString;

import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer;
import at.ooe.fh.mc.codespeech.speechrecognition.events.OnErrorEvent;
import at.ooe.fh.mc.codespeech.speechrecognition.events.ResultEvent;

public class GoogleSpeechRecognizer extends SpeechRecognizer{

	private final int BUFFER_SIZE = 64000;
	private final int GOOGLE_TIMEOUT_LIMIT_IN_MS = 55000;
	
	SpeechClient client;
	ClientStream<StreamingRecognizeRequest> clientStream;     
	RecognitionConfig recognitionConfig;
	StreamingRecognitionConfig streamingRecognitionConfig;
	
	ResponseObserver<StreamingRecognizeResponse> responseObserver;

	public GoogleSpeechRecognizer(Mode mode) throws NotImplementedException {
		super();	
		
		// unfortunately must be called in each subclass for now, because of restriction
		// enforcing super() to be called first which creates an issue because subclass's 
		// variables that are referenced are not initialized yet
		setMode(mode);
	}


	@Override
	protected RecognizerThread createNewRecognizerThread() {
		return new GoogleSpeechRecognizerThread(TIMEOUT_IN_MS);
	}

	@Override
	protected void setupContinuousMode() {
		try {
			client = SpeechClient.create();

			responseObserver = new ResponseObserver<StreamingRecognizeResponse>() {

				ArrayList<StreamingRecognizeResponse> responses = new ArrayList<>();

				public void onStart(StreamController controller) {}

				public void onResponse(StreamingRecognizeResponse response) {
					responses.add(response);
					if(response.getResultsList().size() > 0) {
						StreamingRecognitionResult result = response.getResultsList().get(0);
						// There can be several alternative transcripts for a given chunk of speech. Just
						// use the first (most likely) one here.
						SpeechRecognitionAlternative alternative = result.getAlternativesList().get(0);
						//System.out.printf("Transcript : %s\n", alternative.getTranscript());
						eventHandler.post(new ResultEvent(listeners, alternative.getTranscript().trim()));
						//stopListening(true);
					}
				}

				public void onComplete() {
					//
				}

				public void onError(Throwable throwable) {
					eventHandler.post(new OnErrorEvent(listeners, throwable));
				}
			};
			
			recognitionConfig =
					RecognitionConfig.newBuilder()
					.setEncoding(RecognitionConfig.AudioEncoding.LINEAR16)
					.setLanguageCode("en-US")
					.setSampleRateHertz(16000)
					.build();
			streamingRecognitionConfig =
					StreamingRecognitionConfig.newBuilder().setConfig(recognitionConfig).build();


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void setupKeyphraseSearchMode() throws NotImplementedException {
		throw new NotImplementedException();
	}

	@Override
	protected void setupGrammarMode() throws NotImplementedException {
		throw new NotImplementedException();
	}

	private class GoogleSpeechRecognizerThread extends RecognizerThread {
		
		public GoogleSpeechRecognizerThread(int timeout) {
			super(timeout);
		}

		@Override
		protected void recognize() {			

			int numberOfBytes;
			
			long startTime = System.currentTimeMillis(); 
			
			try {
				clientStream = client.streamingRecognizeCallable().splitCall(responseObserver);
				
				StreamingRecognizeRequest request =
						StreamingRecognizeRequest.newBuilder()
						.setStreamingConfig(streamingRecognitionConfig)
						.build(); // The first request in a streaming call has to be a config

				clientStream.send(request);
				
				while (!interrupted) {					
					long elapsedTime = System.currentTimeMillis() - startTime;
					
					if(elapsedTime >= GOOGLE_TIMEOUT_LIMIT_IN_MS) {
						clientStream.closeSend();

		                clientStream = client.streamingRecognizeCallable().splitCall(responseObserver);
					    
		                request = StreamingRecognizeRequest.newBuilder()
		                         .setStreamingConfig(streamingRecognitionConfig)
		                         .build();
		                
		                clientStream.send(request);
		                startTime = System.currentTimeMillis();
					}
					
					byte[] bytes = new byte[BUFFER_SIZE];
					numberOfBytes = microphone.getStream().read(bytes);

					if(numberOfBytes > 0) {
						ByteBuffer byteBufer = ByteBuffer.wrap(bytes, 0, numberOfBytes);
						byteBufer.order(ByteOrder.LITTLE_ENDIAN);

						request = StreamingRecognizeRequest.newBuilder()
								.setAudioContent(ByteString.copyFrom(byteBufer))
								.build();
						
						clientStream.send(request);
					}
				} 

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				clientStream.closeSend();
			}
			
		}


	}

}
