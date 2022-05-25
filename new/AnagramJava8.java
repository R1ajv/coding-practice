package com.coding.latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramJava8 {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("face", "cafe"));
	    System.out.println(isAnagram("radar", "darr"));
	
	}

	private static boolean isAnagram(String word1, String word2) {

		List<String> wordList1 = new ArrayList<>(Arrays.asList(word1.split("")));
		List<String> wordList2 = new ArrayList<>(Arrays.asList(word2.split("")));
		
		Collections.sort(wordList1);
		Collections.sort(wordList2);
		
		
		word1 = String.join("", wordList1);
		word2 = String.join("", wordList2);
		
		
		return word1.equals(word2);
	}
}
