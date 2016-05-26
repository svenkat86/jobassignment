package com.assignment.service;

public class EmployeeDetailsServiceFactory {

	//Should match the final flag
	public static final String DB_FLAG = "DB";
	public static final String FILE_FLAG = "FILE";
	public static final String JMS_FLAG = "JMS";
	
	
	
	public static EmployeeDetailsService getService(){
		
		if(AssignmentConstants.SERVICE_FLAG.
				equalsIgnoreCase(DB_FLAG)){
	         return new EmployeeDetailsDBService();
	    } 
		else if(AssignmentConstants.SERVICE_FLAG
				.equalsIgnoreCase(FILE_FLAG)){
	         return new EmployeeDetailsFileService();
	    } 
	    else if(AssignmentConstants.SERVICE_FLAG
	    		.equalsIgnoreCase(JMS_FLAG)){
	         return new EmployeeDetailsJMSService();
	    }
		return null;
	}
	
	
	
}
