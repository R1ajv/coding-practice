package com.learning;


final class Immutable{
	
	private final String pancard;
	
	public Immutable(String pancard) {
		this.pancard = pancard ;
	}
		
	

	public String getPancard() {
		return pancard;
	}
}

public class Employee{
	
	public static void main(String[] args) {
		
		Immutable employee = new Immutable("AC1234");
		String s = employee.getPancard();
		System.out.println("Pancard :" +s);
	}
	
}