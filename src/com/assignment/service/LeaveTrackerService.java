package com.assignment.service;

import com.assignment.approval.service.ApproverHandler;
import com.assignment.approval.service.ApproverHandlerUtil;
import com.assignment.approval.service.LevelOneApprover;
import com.assignment.model.Employee;
import com.assignment.util.LeaveUtil;

public class LeaveTrackerService {

	
	public boolean processLeaveRequest(Employee e){
		boolean success = false;
	
		EmployeeDetailsService eds = EmployeeDetailsServiceFactory.getService();
		eds.updateEmployeeLeaveRequest(e);
		
		ApproverHandler approverHandler = ApproverHandlerUtil.setUpChain();
		
		approverHandler.submitLeaveRequestNotification(e.getEmpId(), LeaveUtil.getVacationdays(e));
		
		return true;
		
	}
	
	
	
	
	
}
