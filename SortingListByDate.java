package com.interview.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

class Invoice {

	private Integer id;
	private Double amount;
	private String number;
	private Date createdOn;

	public Invoice(Integer id, Double amount, String number, Date createdOn) {
		super();
		this.id = id;
		this.amount = amount;
		this.number = number;
		this.createdOn = createdOn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {

		return String.format("id = %d, amount = %f, number = %s, createdOn = %s", this.id, this.amount, this.number,
				this.createdOn.toString());
	}

}

public class SortingListByDate {

	private List<Invoice> getInvoiceList() throws ParseException {

		List<Invoice> invoices = Arrays.asList(
				new Invoice(101, 496.67, "SQ078OPQ", new SimpleDateFormat("dd-MM-yyyy").parse("24-04-2020")),
				new Invoice(102, 229.75, "QJ098OJH", new SimpleDateFormat("dd-MM-yyyy").parse("24-09-2020")),
				new Invoice(103, 494.28, "RT048OQT", new SimpleDateFormat("dd-MM-yyyy").parse("21-04-2021")),
				new Invoice(103, 195.56, "SR048OPR", new SimpleDateFormat("dd-MM-yyyy").parse("22-04-2021")),
				new Invoice(103, 285.50, "JT048OTK", new SimpleDateFormat("dd-MM-yyyy").parse("04-12-2019")));
		return invoices;
	};

	public static void main(String[] args) throws ParseException {

		SortingListByDate invoiceService = new SortingListByDate();
		List<Invoice> list = invoiceService.getInvoiceList();

		Comparator<Invoice> comparator = (c1, c2) -> {
			return Long.valueOf(c1.getCreatedOn().getTime()).compareTo(c2.getCreatedOn().getTime());
		};

		Collections.sort(list, comparator);
		list.forEach(System.out::println);
	}
}
