package com.interview.practice;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Employee {

	private int id;
	private String name;
	private int age;;
	private String gender;
	private String department;
	private int yearOfJoining;;
	private double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}

public class StreamAveragSalaryPerDepartment {

	public List<Employee> employeeList = new ArrayList<Employee>();

	public StreamAveragSalaryPerDepartment() {
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		employeeList.add(new Employee(277, "Pragati", 27, "Female", "Scrum Master", 2016, 40000.0));

	}

	public static void main(String[] args) {

		StreamAveragSalaryPerDepartment employee = new StreamAveragSalaryPerDepartment();

		employee.countMaleAndFemale();
		employee.printsAllDepartmentInOrganization();
		employee.averageAgeMalenFemale();
		employee.highestPaidinOrganization();
		employee.joinedAfter2015();
		employee.numberOfEmployeesinEachDepartment();
		employee.avgSalaryperDepartment();
		employee.youngestMaleinProductDevelopment();
		employee.maxExperienceEmp();
		employee.maleAndFemaleinSnM();
		employee.employeeAndDepartment();
		employee.oldestEmp();
		employee.overAndUnder25();
		employee.averageSalaryandTotalSalary();
		employee.empListByDepartment();
	}

	private void empListByDepartment() {
		System.out.println("Query10 : list down the names of all employees in each department ");
		Map<String,List<Employee>> employeeByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String,List<Employee>>> entry = employeeByDepartment.entrySet();
		
		for(Entry<String,List<Employee>> entri: entry) {
			System.out.println("----------------------------------------------");
			System.out.println("Employees In :"+entri.getKey() );
			System.out.println("-----------------------------------------------");
			
			List<Employee> list = entri.getValue();
			
			for(Employee li : list) {
				System.out.println(li.getName());
			}
			
		}
	}

	private void averageSalaryandTotalSalary() {
		System.out.println("Query 11 :  Employee total and average salary");
		DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Average Salary :" + employeeSalaryStatistics.getAverage());

		System.out.println("Total Salary :" + employeeSalaryStatistics.getSum());

		Double averageSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Average Salary :" + averageSalary);
	}

	private void overAndUnder25() {
		System.out.println("Query 12 : Over and under 25 yrs of age of employees \n");
		Map<Boolean, List<Employee>> overAndUnder25 = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		Set<Entry<Boolean, List<Employee>>> list = overAndUnder25.entrySet();

		for (Entry<Boolean, List<Employee>> entry : list) {

			if (entry.getKey()) {
				System.out.println("Employess older than 25");
			} else {
				System.out.println("Employees younger or equal to 25");
			}

			System.out.println("----------------------------");

			List<Employee> ll = entry.getValue();

			for (Employee emp : ll) {
				System.out.println("Name :" + emp.getName() + "  And  Age :" + emp.getAge());
			}

		}

	}

	private void oldestEmp() {
		System.out.println("Query 13 : Oldest employee in organization \n");
		Optional<Employee> oldestEmp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

		System.out.println("Name :" + oldestEmp.get().getName());
		System.out.println("Age :" + oldestEmp.get().getAge());
		System.out.println("Department :"+oldestEmp.get().getDepartment());

	}

	private void employeeAndDepartment() {
		System.out.println("----------------------------");
		System.out.println("Query 14: Employees and department  :");
		
		Map<String, List<Employee>> empAndDepart = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> employeesPerDepartment = empAndDepart.entrySet();

		for (Entry<String, List<Employee>> number : employeesPerDepartment) {
			System.out.println("Employees In : " + number.getKey() + "\nAnd their employees :");

			for (Employee emp : number.getValue()) {
				System.out.println("Name :"+emp.getName());
			}
		}
	}

	private void maleAndFemaleinSnM() {
		System.out.println("Query 10 : male and female in sales and marketing depart :\n");
		
		Map<String, Long> maleAndFemlaInSM = employeeList.stream()
				.filter(e -> e.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		Set<Entry<String, Long>> numberOfMaleAndFemale = maleAndFemlaInSM.entrySet();
		for (Entry<String, Long> num : numberOfMaleAndFemale) {
			System.out.println("Gender :" + num.getKey() + " Value :" + num.getValue());
		}
	}

	private void maxExperienceEmp() {
		System.out.println("Query 9 : max experience of employee :\n");
		Optional<Employee> maxExperience = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		Employee maxExpEmp = maxExperience.get();
		System.out.println("Id :" + maxExpEmp.getId() +" : and name :"+ maxExpEmp.getName());
	}

	private void youngestMaleinProductDevelopment() {
		System.out.println("Query 8 : yougest male in product department  :\n");
		Optional<Employee> youngestMaleInProductDev = employeeList.stream()
				.filter(e -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male"))
				.min(Comparator.comparingInt(Employee::getAge));
		Employee youngestMaleInPD = youngestMaleInProductDev.get();
		System.out.println("young male in PD ::" + youngestMaleInPD);
	}

	private void avgSalaryperDepartment() {
		System.out.println("Query 7 : avg salary of each deparment :\n");
		Map<String, Double> avegSalaryPerDepart = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> entryAverageSalary = avegSalaryPerDepart.entrySet();
		System.out.println("-------------\n");
		for (Entry<String, Double> entry : entryAverageSalary) {
			System.out.println(entry.getKey() + " :avg :" + entry.getValue());
		}
	}

	private void numberOfEmployeesinEachDepartment() {
		System.out.println("Query 6 : Count of employess Per department:\n");
		Map<String, Long> noOfEmployeesPerDepart = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entrys = noOfEmployeesPerDepart.entrySet();

		for (Entry<String, Long> entry : entrys) {
			System.out.println(entry.getKey() + " ,  NumberOfEmplopyees: " + entry.getValue());
		}

	}

	public void joinedAfter2015() {

		System.out.println("Query 5 : Get employess details who joined after 2015");

		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

		List<Employee> joinedAfter2015 = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015)
				.collect(Collectors.toList());

		for (Employee emp : joinedAfter2015) {
			System.out.println("Employee Name: " + emp.getName() + " " + " And joined :" + emp.getYearOfJoining());
		}
	}

	private void highestPaidinOrganization() {
		
		System.out.println("Quesry 4: Highest salary in organization:");
		Optional<Employee> highestPaidinOrganization = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		System.out.println("Max salaary :" + highestPaidinOrganization.get().getSalary());
		Employee highestPaidEmployee = highestPaidinOrganization.get();

		System.out.println("ID : " + highestPaidEmployee.getId());
		System.out.println("Name : " + highestPaidEmployee.getName());
		System.out.println("Age : " + highestPaidEmployee.getAge());
		System.out.println("Gender : " + highestPaidEmployee.getGender());
		System.out.println("Department : " + highestPaidEmployee.getDepartment());
		System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());
	}

	private void averageAgeMalenFemale() {
		System.out.println("Quesry 3: average age of male and female employees");
		Map<String, Double> averageAgeMaleNFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		;
		System.out.println("Average Age :::"+averageAgeMaleNFemale);
	}

	private void printsAllDepartmentInOrganization() {

		System.out.println("Quesry 2: prints name of all departments present in orgaization");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	
	private void countMaleAndFemale() {
		System.out.println("Quesry 1: How many males and female employees present in organization:");
		Map<String, Long> noOfMaleAndFemailes = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemailes);
	}

}