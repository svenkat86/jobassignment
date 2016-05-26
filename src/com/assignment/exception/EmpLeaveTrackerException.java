package com.assignment.exception;

public class EmpLeaveTrackerException extends Exception {

	private static final long serialVersionUID = 1997753363232807009L;
	
	public EmpLeaveTrackerException(String message){
		super(message);
	}

	
	public EmpLeaveTrackerException(Throwable cause){
		super(cause);
	}

	
	public EmpLeaveTrackerException(String message, Throwable cause){
		super(message , cause);
	}

}
