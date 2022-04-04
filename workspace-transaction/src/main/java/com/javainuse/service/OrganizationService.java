package com.javainuse.service;

import org.springframework.beans.factory.annotation.Qualifier;

import com.javainuse.model.Employee;
import com.javainuse.model.EmployeeHealthInsurance;

@Qualifier
public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}