package com.interview.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		
		String original = "Automation";
		
		String output = 
				Arrays.asList(original.split(" "))
				.stream()
				.map(str -> new StringBuilder(str).reverse())
				.collect(Collectors.joining(""));
		
		System.out.println(output);//reverse string
		
		char[] charrs = original.toCharArray();
		
		for(  int i = charrs.length - 1 ; i>= 0 ;i--) {
			System.out.print(charrs[i]);
		}
		
		System.out.println("\n");
		
		
		//Java program to swap to  character using third
		
		int x , y,  temp ;
		
		System.out.println("Enter x and y value");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before swapping :"+x + y);
	
		temp = x ;
		x = y ;
		y = temp ;
		
		System.out.println("After swapping :"+ x + y);
		
		//Java program to count number of words in String
		
		String s = "Kashmir files talks about the reality of kashmir at 1990 correct";
		Map<String, Long>  arr=
				Arrays.asList(s.split("\\s"))
		.stream()
		.map(word ->  word.toUpperCase())
		.collect(Collectors.groupingBy(word->word , Collectors.counting() ));
		System.out.println(arr);
		
		int temp1 , num ;
		Scanner sc1 = new Scanner(System.in);
		temp1  = sc1.nextInt();
		
		if(temp1%2 ==0) {
			System.out.println("Number is even : "+temp1);
		}else {
			System.out.println("Number is odd : "+ temp1);
		}
		
		
		
		
		List<String> output1= Arrays.asList(original.split(""))
				.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(output1); //removing  duplicate character
	
		
		Map<Object, Long> output2= Arrays.asList(original.split(""))
		.stream()
		.collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		System.out.println(output2); // number of characters occurrence in string
		
		String radar = "radar"; 
		boolean value =
				IntStream
				.range(0,radar.length()/2)
				.noneMatch(i->radar.charAt(i) != radar.charAt(radar.length() - i - 1));
		
		System.out.println(value);
		
		final Set <Character> allVowels = 
				new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		
		//String str = "Pragati";
		
		long vowels = original.chars()
	            .filter(c -> allVowels.contains((char) c))
	            .count();
		
		System.out.println(vowels);
		
		long consonants = original.chars()
	            .filter(c -> !allVowels.contains((char) c))
	            .count();
		
		System.out.println(consonants);
	}
}
