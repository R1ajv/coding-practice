package com.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> list  = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		List<Integer> ll = list.stream().filter(m -> m%2 !=0).collect(Collectors.toList());
		System.out.println(ll);
		
		System.out.println("------------------------------");
		
		List<Integer> ll1 = list.stream().filter(m -> m%2 !=0).map(i->i*4).collect(Collectors.toList());
		System.out.println(ll1);
	}
}
