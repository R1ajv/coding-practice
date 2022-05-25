package com.interview.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SqaureNumberAndSum {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		List<Integer> squareLisst = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		Integer sumvalue = squareLisst.stream().reduce(0,Integer::sum);

		System.out.println(squareLisst);
		System.out.println(sumvalue);
	}
}
