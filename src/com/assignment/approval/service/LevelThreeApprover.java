/**
 * 
 */
package com.assignment.approval.service;

import com.assignment.service.LeaveTrackerService;
import com.assignment.util.LeaveUtil;

/**
 * @author rsa19581
 *
 */
public class LevelThreeApprover extends ApproverHandler {

	/* (non-Javadoc)
	 * @see com.assignment.approval.service.ApproverHandler#submitLeaveRequest(int, int)
	 */
	@Override
	public void submitLeaveRequestNotification(int requestorEmpId, int vacationDays) {
		
		if(vacationDays > 10){
			//logic to retrieve email address and create array of email address and pass it to the method
			String toAddress[] = {""};
			LeaveUtil.notifyLeaveRequestByEmail(toAddress);
		}
	}

}
