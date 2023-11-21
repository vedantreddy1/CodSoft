package com.Word_Counter.Wordly;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountAnalyzer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text or provide a file path");
		
		String input = scanner.nextLine();
		String content;
		
		
		if(input.endsWith(".txt")) {
			try {
				content= readFile(input);
			} catch (IOException e) {
				System.out.println("ERROR IN READING FILE : "+e.getMessage());
				return;
			}
		} else {
			content = input;
		}
		String W = "[\\s.,;:!?()\\[\\]{}'\"]+";
		String[] words = content.split(W);
		
		int wordCount = 0;
		
		String[] stopWords = {"the","and","is","in", "of","to","a","for"};
		
		Map<String, Integer> wordFrequency = new HashMap<>();
		
		for(String word : words) {
			if(!isStopWord(word,stopWords)) {
				wordCount++;
				wordFrequency.put(word, wordFrequency.getOrDefault(word, 0)+1);
			}
		}
		System.out.println("Total word Count : " + wordCount);
		
		System.out.println("Word Frequency: ");
		wordFrequency.forEach((word,frequency)->System.out.println(word + ":"+ frequency));
	}
private static String readFile(String filePath) throws IOException{
	return new String(Files.readAllBytes(Paths.get(filePath)));
}

private static boolean isStopWord(String word, String[] stopWords) {
	for(String stopWord : stopWords ) {
		if (word.equalsIgnoreCase(stopWord)) {
			return true;
		}
	}
	return false;
}


}
