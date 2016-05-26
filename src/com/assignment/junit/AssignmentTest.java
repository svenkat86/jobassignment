package com.assignment.junit;

import static org.junit.Assert.*;

import com.assignment.model.Employee;
import com.assignment.util.LeaveUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import junit.framework.Assert;

import org.junit.Test;

public class AssignmentTest {

	@Test
	public void testGetVacationdays() throws ParseException {
		
		Employee e = new Employee(12345);
		DateFormat format = new SimpleDateFormat("MM/dd/yy", Locale.ENGLISH);
		e.setStartDate(format.parse("05/21/16"));
		e.setEndDate(format.parse("05/25/16"));
		
		assertNotNull(LeaveUtil.getVacationdays(e));
		assertEquals(4, LeaveUtil.getVacationdays(e));
		
		assertNotEquals(5, LeaveUtil.getVacationdays(e));
		
	}

	

}
