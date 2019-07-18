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
import at.ooe.fh.mc.codespeech.speechrecognition.events.*;

public class GoogleSpeechRecognizer extends SpeechRecognizer{

	SpeechClient client;
	ClientStream<StreamingRecognizeRequest> clientStream;     
	RecognitionConfig recognitionConfig;
	StreamingRecognitionConfig streamingRecognitionConfig;

	ResponseObserver<StreamingRecognizeResponse> responseObserver;

	public GoogleSpeechRecognizer(Mode mode) throws NotImplementedException {
		super();	

		setMode(mode);
	}


	@Override
	protected RecognizerThread createNewRecognizerThread() {
		return new GoogleSpeechRecognizerThread(DEFAULT_TIMEOUT_IN_MS);
	}

	@Override
	protected void setupContinuousMode() {
		try {
			client = SpeechClient.create();

			responseObserver = new ResponseObserver<StreamingRecognizeResponse>() {

				ArrayList<StreamingRecognizeResponse> responses = new ArrayList<>();

				public void onStart(StreamController controller) {
				}

				public void onResponse(StreamingRecognizeResponse response) {
					responses.add(response);
					if(response.getResultsList().size() > 0) {
						StreamingRecognitionResult result = response.getResultsList().get(0);
						// There can be several alternative transcripts for a given chunk of speech. Just
						// use the first (most likely) one here.
						SpeechRecognitionAlternative alternative = result.getAlternativesList().get(0);
						//System.out.printf("Transcript : %s\n", alternative.getTranscript());
						eventHandler.post(new OnResultEvent(listeners, alternative.getTranscript().trim()));
					}
				}

				public void onComplete() {
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
		
		private final int GOOGLE_TIMEOUT_LIMIT_IN_MS = 55000;
		
		private StreamingRecognizeRequest request;
		
		private long connectionStartTime;
		private long connectionElapsedTime;

		public GoogleSpeechRecognizerThread(int timeout) {
			super(timeout);
		}

		@Override
		protected void recognize(byte [] bytes, int numberOfBytes) throws Exception {		
			if(reachedConnectionTimeOut()) {
				renewConnection();
			}

			ByteBuffer byteBufer = ByteBuffer.wrap(bytes, 0, numberOfBytes);
			byteBufer.order(ByteOrder.LITTLE_ENDIAN);

			request = StreamingRecognizeRequest.newBuilder()
					.setAudioContent(ByteString.copyFrom(byteBufer))
					.build();

			clientStream.send(request);
		}

		@Override
		protected void beforeRecognition() {
			clientStream = client.streamingRecognizeCallable().splitCall(responseObserver);

			request = StreamingRecognizeRequest.newBuilder()
					.setStreamingConfig(streamingRecognitionConfig)
					.build(); // The first request in a streaming call has to be a config

			clientStream.send(request);
		}

		@Override
		protected void afterRecognition() {
			clientStream.closeSend();
		}
		
		private boolean reachedConnectionTimeOut() {
			connectionElapsedTime = System.currentTimeMillis() - connectionStartTime;
			return connectionElapsedTime >= GOOGLE_TIMEOUT_LIMIT_IN_MS;
		}
		
		private void renewConnection() {
			clientStream.closeSend();

			clientStream = client.streamingRecognizeCallable().splitCall(responseObserver);

			request = StreamingRecognizeRequest.newBuilder()
					.setStreamingConfig(streamingRecognitionConfig)
					.build();

			clientStream.send(request);
			connectionStartTime = System.currentTimeMillis();
		}

	}

}
