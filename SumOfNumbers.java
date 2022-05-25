package com.interview.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers11 = List.of(1,3,5,7,8,9,2,4,6);
		
		numbers11
		.stream()
		.filter(m->m%5==0)//streams<T> These are intermediate operations
		.distinct() //returns streams<T>
		.sorted() //streams<T>
		.map(i->i*i)//streams<T>
		.forEach(System.out::println); //Terminal operation //returns void
	
		
		Integer sum = numbers11.stream()
				.reduce(0,Integer::sum); //returns  1 element of type //terminal operation
		
		
		System.out.println(sum);
		
		List<String> course2=
				List.of("Spring","Docker","Microservices","Spring MVC","AWS","PCF");
		
		
		course2.
		stream().
		sorted(Comparator.comparing(m->m.length()))
		.collect(Collectors.toList()) //returns any type
		.forEach(System.out::println);
		
		
		
		numbers11.stream().map(number -> number * number).forEach(System.out::println);;
		
		//System.out.println(numbers11);
	}
}
