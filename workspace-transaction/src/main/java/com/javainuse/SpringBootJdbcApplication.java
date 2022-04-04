package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.javainuse.model.Employee;
import com.javainuse.model.EmployeeHealthInsurance;
import com.javainuse.service.OrganizationService;

public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);
		
		
		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("Rajeev");
		
		EmployeeHealthInsurance empHealthInsurance = new EmployeeHealthInsurance();
		empHealthInsurance.setEmpId("emp1");
		empHealthInsurance.setHealthInsuranceSchemeName("premium");
		
		empHealthInsurance.setCoverageAmount(200000);
		
		organizationService.joinOrganization(emp, empHealthInsurance);
	
	}
}