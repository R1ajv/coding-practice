package com.coding.latest;

record Employee(int id, String firstName,
        String lastName) {
	
	 // parameters but record can define static fields.
    static int empToken;
    
	 public Employee
	    {
	        if (id < 100) {
	            throw new IllegalArgumentException(
	                "Employee Id cannot be below 100.");
	        }
	        if (firstName.length() < 2) {
	            throw new IllegalArgumentException(
	                "First name must be 2 characters or more.");
	        }
	    }
	 
	// Constructor 2 of this class
	    // Alternative Constructor
	 
	 public Employee(int id , String firstName) {
		 this(id,firstName, null);
	 }
	 
	 
	 public void getFullName() {
		 
		 if(lastName == null ) {
			 System.out.println(firstName());
		 }
		 else {
			 System.out.println(firstName() + " " + lastName);
		 }
	 }
	 
	 //static methods
	 public static int getEmployeeGeneratedToken() {
		 
		 return ++empToken;
	 }
	 
}

public class GFG {

	public static void main(String[] args) {
		
		 // Creating object with default constructor
	    Employee e1 = new Employee(1001, "Derok", "Dranf");
	 
	    // auto generated getter methods
	    System.out.println(e1.id() + " " + e1.firstName()
	                       + " " + e1.lastName());
	 
	    // Auto-generated toString() method
	    System.out.println(e1.toString());
	 
	    // Creating object with parameterized constructor
	    Employee e2 = new Employee(1002, "Seren");
	 
	    // Using instance methods
	    e2.getFullName();
	 
	    // Using static methods
	    System.out.println("Employee " + e2.id()
	                       + " Token = "
	                       + e2.getEmployeeGeneratedToken());
	 
	    // Using the equals() method
	    System.out.print("Is e1 equal to e2: "
	                     + e1.equals(e2));
		
	}
}
