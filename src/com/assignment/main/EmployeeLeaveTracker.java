package com.assignment.main;

import com.assignment.exception.NoSuchEmployeeException;
import com.assignment.model.Employee;
import com.assignment.service.EmployeeDetailsServiceFactory;
import com.assignment.service.LeaveTrackerService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class EmployeeLeaveTracker {
	
	static Logger log = Logger.getLogger(EmployeeLeaveTracker.class.getName());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{			
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter your 5 digit employee number (only numbers) :");
			int eId = reader.nextInt(); 
			
			System.out.println("Enter start Date of vacation :");
			String startDate = reader.next();
			
			System.out.println("Enter End Date of vacation :");
			String endtDate = reader.next();
			
			DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
			
			Employee e = EmployeeDetailsServiceFactory.getService().fetchEmployeeDetails(eId);
			
			e.setStartDate(format.parse(startDate));
			e.setEndDate(format.parse(endtDate));
			
			//Get Vacation Days 
			LeaveTrackerService lts = new LeaveTrackerService();
			lts.processLeaveRequest(e);
			
			
			
			
		}
		catch(NoSuchEmployeeException e){
			log.error(e);
		} catch (ParseException pe) {
			log.error(pe);
		}
		
		
		
		
		
}
	
	
	/*public static int max(int... values){
		int max = Integer.MIN_VALUE;
		for(int i : values){
			if(i > max) max = i;
		}
		return max;
		
	}*/

}
