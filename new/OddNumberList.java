package com.coding.latest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OddNumberList {

	public static void main(String[] args) {
		
		List<Integer> arr = List.of(1,3,4,6,5,7,8,9,2,1);
		Integer oddNumber = arr.stream().filter(i->i%2!=0).map(m-> m *m).reduce(0,Integer::sum);
		System.out.println(oddNumber);
		
		
	}
}
