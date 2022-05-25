package com.coding.latest;

public class MaxSumOfSubArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(arr));
		
	}

	private static int maxSubArraySum(int[] arr) {
		
		int size = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int curr_sum = 0 ;
		
		
		for(int i=0 ; i< size; i++) {
			curr_sum += arr[i];
			
			if(maxSum< curr_sum) 
				maxSum= curr_sum;
			
			if(curr_sum< 0) 
				curr_sum = 0;
			
		}
		return maxSum;
	}	
	
}		
