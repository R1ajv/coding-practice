package com.interview.practice;

public class SumOfSubArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,7,7};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(arr));
		
	}

	public static int maxSubArraySum(int[] arr) {
		int size = arr.length;
		
		int max_so_far = Integer.MIN_VALUE , max_ending_here = 0 ;
		
		for(int i=0 ; i< size ; i++) {
			
			max_ending_here = max_ending_here + arr[i];
			
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here ;
			
			if(max_ending_here < 0)
				max_ending_here = 0 ;
		}
		return max_so_far;
	}
}
