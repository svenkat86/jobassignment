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
public class EmployeeDetailsJMSService implements EmployeeDetailsService {

	/* (non-Javadoc)
	 * @see com.assignment.service.EmployeeDetailsService#updateEmployeeLeaveRequest(com.assignment.model.Employee)
	 */
	@Override
	public void updateEmployeeLeaveRequest(Employee e) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.assignment.service.EmployeeDetailsService#getEmployeeLeaveRequest(com.assignment.model.Employee)
	 */
	@Override
	public void getEmployeeLeaveRequest(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee fetchEmployeeDetails(int empId) throws NoSuchEmployeeException {
		//Make JMS call and get data
		
		return null;
	}

}
