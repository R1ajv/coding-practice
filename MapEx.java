package com.interview.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Eight", 8);
		map.put("One", 1);
		map.put("Seven", 7);
		map.put("Two", 2);
		map.put("Zero", 0);
		
		map.entrySet().stream().map(i->i.getKey().toLowerCase()).sorted().forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	
	}
}
