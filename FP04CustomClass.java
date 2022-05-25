package com.interview.practice;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Course {

	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course() {

	}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 20000),
				new Course("Aws", "Cloud", 96, 21000), new Course("FullStack", "FullStack", 91, 10000),
				new Course("Azure", "Cloud", 92, 15000), new Course("Microservices", "Microservices", 100, 25000),
				new Course("Docker", "Framework", 99, 19000), new Course("Kubernetes", "Framework", 91, 17000));
		// allMatch noneMatch anyMatch //true or false
		
		System.out.println("----------------1st ::");
		System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() > 90));

		System.out.println("----------------2nd ::");
		courses.stream().sorted(Comparator.comparing(Course::getNoOfStudents)).forEach(System.out::println);

		System.out.println("----------------3rd ::");
		courses.stream().sorted(Comparator.comparing(Course::getNoOfStudents).reversed()).forEach(System.out::println);

		System.out.println("----------------4th ::");

		courses.stream()
				.sorted(Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed())
				.forEach(System.out::println);

		System.out.println("----------------5th ::");

		courses.stream()
				.sorted(Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed())
				.skip(3).limit(5).forEach(System.out::println);

		System.out.println("----------------6th ::");

		courses.stream().takeWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList())
				.forEach(System.out::println);
		;

		System.out.println("---------------7th- ::");

		courses.stream().dropWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("----------------8th ::");

		System.out.println(courses.stream().filter(course -> course.getReviewScore() >= 99).findFirst());// Optional[Docker:19000:99]

		System.out.println("----------------9th ::");
		System.out.println(courses.stream().filter(course -> course.getReviewScore() >= 99).findAny());

		System.out.println("----------------10th ::");
		OptionalInt vslue = courses.stream().filter(course -> course.getReviewScore() == 100)
				.mapToInt(course -> course.getNoOfStudents()).max();
		;
		System.out.println(vslue); // OptionalDouble[20000.0]

		System.out.println("----------------11th ::");

		System.out.println(courses
				.stream()
				.collect(Collectors
						.groupingBy(Course::getCategory , Collectors
								.maxBy(Comparator.comparing(Course::getReviewScore)))));
		//{Cloud=Optional[Aws:21000:96], FullStack=Optional[FullStack:10000:91], Microservices=Optional[Microservices:25000:100], Framework=Optional[Docker:19000:99]}
		
		System.out.println("----------------12th ::");

		System.out.println(courses
		.stream()
		.collect(Collectors.groupingBy(Course::getCategory , 
				Collectors.mapping(Course::getName, Collectors.toList()))));
		
		//{Cloud=[Aws, Azure], FullStack=[FullStack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot, Docker, Kubernetes]}

		System.out.println("----------------13th ::");
		
		System.out.println(courses
				.stream()
				.collect(Collectors.groupingBy(Course::getCategory)));
		
		System.out.println("----------------14th ::");
		
		System.out.println(courses
				.stream()
				.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))); //{Cloud=2, FullStack=1, Microservices=2, Framework=4}
	
		System.out.println("----------------15th ::");
		
		System.out.println(courses
				.stream()
				.collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
	
		System.out.println("----------------16th ::");
		
		System.out.println(courses
				.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
				Collectors.mapping(Course::getName, Collectors.toList()))));
		
		System.out.println("----------------");
		
		/*courses
			.stream()
			.collect(Collectors.joining("-"),"");*/
		
	}
}
