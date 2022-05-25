package com.coding.latest;

import java.util.Scanner;

public class LeapYear {

	private static boolean checkLeapYear(int year) {

		boolean result;
		
		if(year%4==0) {
			result = true;
		if(year%100==0){
			
			if(year%400==0) {
				result = true;
			}
			else result = false;
		}
	}
	else result = false;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
		int  year ;
		boolean isLeapYear;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the Year :");
		year  = sc.nextInt();
		
		isLeapYear = checkLeapYear(year);
		
		if(isLeapYear){
	        System.out.println("Entered year is Leap Year");
	    }
	    else System.out.println("Entered year is not Leap year");
	    sc.close();
	    }
		
	}