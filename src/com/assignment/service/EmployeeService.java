package com.assignment.service;

import com.assignment.exception.NoSuchEmployeeException;
import com.assignment.model.Employee;

public class EmployeeService {

	
	
	public Employee fetchEmployeeDetails(int empId) throws NoSuchEmployeeException{
		
		EmployeeDetailsService eds = EmployeeDetailsServiceFactory.getService();
		return eds.fetchEmployeeDetails(empId);
	
	
	}
	
	
	
}
