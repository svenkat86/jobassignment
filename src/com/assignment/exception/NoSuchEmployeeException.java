/**
 * 
 */
package com.assignment.exception;

/**
 * @author rsa19581
 *
 */
public class NoSuchEmployeeException extends EmpLeaveTrackerException {
	
	
	private static final long serialVersionUID = 1997753363232807009L;
	
	
	public NoSuchEmployeeException(String message){
		super(message);
	}

	
	public NoSuchEmployeeException(Throwable cause){
		super(cause);
	}

	
	public NoSuchEmployeeException(String message, Throwable cause){
		super(message , cause);
	}


}
