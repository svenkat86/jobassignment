/**
 * 
 */
package com.assignment.service;

import com.assignment.exception.NoSuchEmployeeException;
import com.assignment.model.Employee;

/**
 * @author rsa19581
 *
 */
public interface EmployeeDetailsService {

	public void updateEmployeeLeaveRequest(Employee e);
	
	public void getEmployeeLeaveRequest(Employee e);
	
	
	public Employee fetchEmployeeDetails(int empId) throws NoSuchEmployeeException;
	
	
	
}
