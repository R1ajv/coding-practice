package com.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.LongStream;

class EmployeeDatabase11 {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();

		for (int i = 1; i <= 100; i++) {
			employees.add(new Employee(i, "employee", i, "male", "sale", 2020,
					Double.valueOf(new Random().nextInt(1000 * 100))));
		}
		return employees;

	}
}

public class FP05ParallelString {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;

		long time = System.currentTimeMillis();

		System.out.println(LongStream.range(0, 1000).parallel().sum());

		System.out.println("----------------------------------------------------------------------------------------");

		List<Employee> employesss = EmployeeDatabase11.getEmployees();

		start = System.currentTimeMillis();
		double salaryWithStream = employesss.stream().map(Employee::getSalary).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();

		System.out.println("Normal stream execution time :" + (end - start) + ": Average Salary" + salaryWithStream);

		start = System.currentTimeMillis();
		double salaryWithParallelStream = employesss.parallelStream().map(Employee::getSalary).mapToDouble(i -> i)
				.average().getAsDouble();
		end = System.currentTimeMillis();

		System.out.println(
				"Parallel stream execution time :" + (end - start) + " :Average Salary " + salaryWithParallelStream);

	}
}
