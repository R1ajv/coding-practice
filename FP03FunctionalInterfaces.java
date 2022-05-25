package com.interview.practice;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;


public class FP03FunctionalInterfaces {

	public static void main(String[] args) {

		List<Integer> numbers= List.of(12,4,5,6,13,10,5);
		
    	System.out.println("---------------------------------");
		
		filterAndPrint(numbers , x->x%3==0);
		
		List<Integer> squareNumbers = mapAndCreateNumbers(numbers , m->m*m);
		
		System.out.println(squareNumbers);
		
		Supplier<Integer> randomIntegerSupplier = () ->{ 
		Random ran = new Random();
		return ran.nextInt(100);
		//System.out.println(randomIntegerSupplier.get());
		};
		
		UnaryOperator<Integer> unaryOperation = (x) -> 3*x;
		
		System.out.println(unaryOperation.apply(10));
		
		
		BiPredicate<Integer , String> biPred = (number , str) ->{
			return number < 10 && str.length() > 5;
		};
		
		System.out.println(biPred.test(15, "RajeevSoniJindabaad"));
	
	
	BiFunction<Integer , String , String> biFunc = (number , str) ->{
		return number + " " +str;
	};
	
	System.out.println(biFunc.apply(15, "RajeevSoniJindabaad"));
	}
	private static List<Integer> mapAndCreateNumbers(List<Integer> numbers, 
			Function<Integer,Integer> mappingFunction1) {
		return numbers
				.stream()
				.map(mappingFunction1)
				.collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers , Predicate<? super Integer> predicate) {
		
		Function<Integer,Integer> mappingFunction = m->m*m;
		numbers
		.stream()
		.filter(predicate)
		.map(mappingFunction)
		.forEach(System.out::println);
	}
	
	
	

}
