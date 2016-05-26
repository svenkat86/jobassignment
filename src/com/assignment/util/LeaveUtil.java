package com.assignment.util;

import com.assignment.model.Employee;

public class LeaveUtil {

	
	public static int getVacationdays(Employee e){
		int vacation = 0;
		vacation = (int)(e.getEndDate().getTime() - e.getStartDate().getTime())/((1000 * 60 * 60 * 24));
		return vacation;
	}
	
	
	public static void notifyLeaveRequestByEmail(String... toAddress){
		
		//Logic to send email based on the incoming address
		
	}
	
	
	
}
