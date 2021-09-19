//thanks to https://stackoverflow.com/questions/26948858/converting-words-to-numbers-in-java

package at.ooe.fh.mc.codespeech.general.utils;

import java.util.Arrays;
import java.util.List;

import at.ooe.fh.mc.codespeech.general.exceptions.InvalidWordException;

public class WordToNumber {

	static int result;
	static int finalResult;
	static List<String> allowedStrings = Arrays.asList //consists also hononyms like "to, for, free" 
			(
					"zero","one","two","to","three","free","four","for", "far", "five","six","seven",
					"eight","nine","ten","eleven","twelve","thirteen","fourteen",
					"fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
					"thirty","forty","fifty","sixty","seventy","eighty","ninety",
					"hundred","thousand"
					//,"million","billion","trillion"
					);


	public static int convert(String numericWordToConvert) throws InvalidWordException {
		finalResult = 0;
		result = 0;

		if(numericWordToConvert != null && numericWordToConvert.length()> 0)
		{
			numericWordToConvert = numericWordToConvert.replaceAll("-", " ");
			numericWordToConvert = numericWordToConvert.toLowerCase().replaceAll(" and", " ");
			String[] splittedParts = numericWordToConvert.trim().split("\\s+");

			for(String str : splittedParts)
			{
				if(!allowedStrings.contains(str))
				{
					System.out.println("Invalid word found : "+str);
					throw new InvalidWordException("Word is not a number");
				}
			}
			for(String str : splittedParts)
			{
				if(str.equalsIgnoreCase("zero")) {
					result += 0;
				}
				else if(str.equalsIgnoreCase("one")) {
					result += 1;
				}
				else if(str.equalsIgnoreCase("two") || str.equalsIgnoreCase("to")) {
					result += 2;
				}
				else if(str.equalsIgnoreCase("three") || str.equalsIgnoreCase("free")) {
					result += 3;
				}
				else if(str.equalsIgnoreCase("four") || str.equalsIgnoreCase("for") || str.equalsIgnoreCase("far")) {
					result += 4;
				}
				else if(str.equalsIgnoreCase("five")) {
					result += 5;
				}
				else if(str.equalsIgnoreCase("six")) {
					result += 6;
				}
				else if(str.equalsIgnoreCase("seven")) {
					result += 7;
				}
				else if(str.equalsIgnoreCase("eight")) {
					result += 8;
				}
				else if(str.equalsIgnoreCase("nine")) {
					result += 9;
				}
				else if(str.equalsIgnoreCase("ten")) {
					result += 10;
				}
				else if(str.equalsIgnoreCase("eleven")) {
					result += 11;
				}
				else if(str.equalsIgnoreCase("twelve")) {
					result += 12;
				}
				else if(str.equalsIgnoreCase("thirteen")) {
					result += 13;
				}
				else if(str.equalsIgnoreCase("fourteen")) {
					result += 14;
				}
				else if(str.equalsIgnoreCase("fifteen")) {
					result += 15;
				}
				else if(str.equalsIgnoreCase("sixteen")) {
					result += 16;
				}
				else if(str.equalsIgnoreCase("seventeen")) {
					result += 17;
				}
				else if(str.equalsIgnoreCase("eighteen")) {
					result += 18;
				}
				else if(str.equalsIgnoreCase("nineteen")) {
					result += 19;
				}
				else if(str.equalsIgnoreCase("twenty")) {
					result += 20;
				}
				else if(str.equalsIgnoreCase("thirty")) {
					result += 30;
				}
				else if(str.equalsIgnoreCase("forty")) {
					result += 40;
				}
				else if(str.equalsIgnoreCase("fifty")) {
					result += 50;
				}
				else if(str.equalsIgnoreCase("sixty")) {
					result += 60;
				}
				else if(str.equalsIgnoreCase("seventy")) {
					result += 70;
				}
				else if(str.equalsIgnoreCase("eighty")) {
					result += 80;
				}
				else if(str.equalsIgnoreCase("ninety")) {
					result += 90;
				}
				else if(str.equalsIgnoreCase("hundred")) {
					result *= 100;
				}
				else if(str.equalsIgnoreCase("thousand")) {
					result *= 1000;
					finalResult += result;
					result=0;
				}
				//					else if(str.equalsIgnoreCase("million")) {
				//						result *= 1000000;
				//						finalResult += result;
				//						result=0;
				//					}
				//					else if(str.equalsIgnoreCase("billion")) {
				//						result *= 1000000000;
				//						finalResult += result;
				//						result=0;
				//					}
				//					else if(str.equalsIgnoreCase("trillion")) {
				//						result *= 1000000000000L;
				//						finalResult += result;
				//						result=0;
				//					}
			}

			finalResult += result;
		}
		return finalResult;
	}
}
