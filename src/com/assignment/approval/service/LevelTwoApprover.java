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
public class LevelTwoApprover extends ApproverHandler {

	/* (non-Javadoc)
	 * @see com.assignment.approval.service.ApproverHandler#submitLeaveRequest(int, int)
	 */
	@Override
	public void submitLeaveRequestNotification(int requestorEmpId, int vacationDays) {
		// TODO Auto-generated method stub
		if(vacationDays > 3 && vacationDays <= 10){
			//send email to supervisor and Manager
			//logic to retrieve supervisor and manager detail based on the requestedEmpId an
			String toAddress = "";
			LeaveUtil.notifyLeaveRequestByEmail(toAddress);
		}
		else{
			if (supervisor != null) {
				supervisor.submitLeaveRequestNotification(requestorEmpId,vacationDays);
			}
			
		}
		
	}

}
