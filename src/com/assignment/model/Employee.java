package com.assignment.model;

import java.util.Date;

public class Employee {

	public Employee(int empId){
		this.empId = empId;
	}
	
	private String name;
	private String emailAddress;
	
	private int empId;
	private int vacationDays;
	
	private Date startDate;
	private Date endDate;
	
	public void printDetails(){
		System.out.println(this.name);
		System.out.println(this.emailAddress);
		
		System.out.println(this.empId);
		System.out.println(this.vacationDays);
		
		System.out.println(this.startDate);
		System.out.println(this.endDate);
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
