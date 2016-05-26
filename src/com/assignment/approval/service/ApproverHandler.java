package com.assignment.approval.service;

public abstract class ApproverHandler {
	
	ApproverHandler supervisor;
	
	public void setSupervisor(ApproverHandler supervisor) {
		this.supervisor = supervisor;
	}

	public abstract void submitLeaveRequestNotification(int requestorEmpId, int vacationDays);
	
}
