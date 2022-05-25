package com.interview.practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Pallindrome {

	public static void main(String[] args) {
		
		//Check if 'radar' is Palindrome
        System.out.println("Is radar a Palindrome? - " + isPalindrome("Radar")); //true
 
        //Check if 'apple' is Palindrome
        System.out.println("Is apple a Palindrome? - " + isPalindrome("Madam1")); //false
	
	}

	public static boolean isPalindrome(String originalString) {
		
		String tempString = originalString.toLowerCase();
		
		return IntStream
			   .range(0, tempString.length()/2)
			   .anyMatch(i-> tempString.charAt(i) == tempString.charAt(tempString.length() - i -1));
				
	}
}
