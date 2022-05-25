package com.interview.practice;

public class SumSubArraySix {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("Six as sum is " +
                maxSubArraySum(arr));
	}

	private static int maxSubArraySum(int[] arr) {
		int size  = arr.length ;
		int temp = 0 ;
		int max_six = 0 ;
		
		
		for(int i= 0 ; i < size ; i++) {
			
			temp = temp +  arr[i];
			
			if(max_six  < 6) {
				max_six = temp;
			}else if(max_six == 6) {
				
				break;
			}
		}
		
		return max_six;
	}
}
