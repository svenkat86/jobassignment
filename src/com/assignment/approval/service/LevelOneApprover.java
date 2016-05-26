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
public class LevelOneApprover extends ApproverHandler {

	/* (non-Javadoc)
	 * @see com.assignment.approval.service.ApproverHandler#handleRequest(int)
	 */
	@Override
	public void submitLeaveRequestNotification(int requestorEmpId,int vacationDays) {
		
		if(vacationDays <= 3){
			//send email to supervisor alone
			//logic to retrieve supervisor detail based on the requestedEmpId
			String toAddress = "";
			LeaveUtil.notifyLeaveRequestByEmail(toAddress);
		}
		else{
			//Delegate to next level
			if (supervisor != null) {
				supervisor.submitLeaveRequestNotification(requestorEmpId,vacationDays);
			}
			
		}
	}

}
