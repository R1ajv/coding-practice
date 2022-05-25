package com.interview.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Customer {
	private int id;
	private String name;
	private Date birthday;
	
	public Customer(int id, String name, Date birthday){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	public int getId() {
		return id;
	}
	
	public Date getBirthday() {
		return this.birthday;
	}
	
	public String toString() {
		return String.format("id = %d, name = %s, birthday = %s", this.id, this.name, this.birthday.toString());
	}
}
public class JavaArraySortingEx {

	public JavaArraySortingEx() throws ParseException{
		
	}
	
	List<Customer> customers = Arrays.asList(
			new Customer(1, "Jack", new SimpleDateFormat("dd-MM-yyyy").parse("23-04-1989")),
			new Customer(7, "Mary", new SimpleDateFormat("dd-MM-yyyy").parse("19-08-1977")),
			new Customer(3, "Joe", new SimpleDateFormat("dd-MM-yyyy").parse("09-02-1980")), 
			new Customer(9, "Peter", new SimpleDateFormat("dd-MM-yyyy").parse("18-07-1983")),
			new Customer(2, "Bob", new SimpleDateFormat("dd-MM-yyyy").parse("15-10-1978")),
			new Customer(5, "Jane", new SimpleDateFormat("dd-MM-yyyy").parse("19-08-1991"))
			);
	
	public static void main(String[] args) throws ParseException  {
		
		JavaArraySortingEx sorting = new JavaArraySortingEx();
		
		sorting.sortByBirthday();
		
		
		
	}

	private void sortByBirthday() {

		Optional<Customer> latestItem = customers.stream()
                .sorted((c1, c2) -> ((Customer) c2).getBirthday().compareTo(((Customer) c1).getBirthday()))
                .findFirst();
		System.out.println(latestItem);
		
		Optional<Customer> OldestCustomer = customers.stream()
                .sorted((c1, c2) -> ((Customer) c1).getBirthday().compareTo(((Customer) c2).getBirthday()))
                .findFirst();
		System.out.println("OldestCustomer Custmer "+OldestCustomer.get());
		
		
		Comparator<Customer> byBirthday =(c1, c2)->{if (c1.getBirthday().before(c2.getBirthday())) return -1; else return 1;};
		List<Customer> newCustomers = (List<Customer>) customers.stream().sorted(byBirthday)
											.collect(Collectors.toList());
		
		System.out.println("Sorten using comparators"+ newCustomers);
}
}