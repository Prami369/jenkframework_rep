package com.crm.generic.webdriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	Date dateobj = new Date();
	SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
	
	public int getRandomNumber() {
		Random ran = new Random();		
		return ran.nextInt(5000);
		
	}
	
	public String getSystemDateYYYYMMDD() {
	String date= sim.format(dateobj);
	return date;
	
	}
	
	public String getupdatedDate(int day) {
		String startdate= sim.format(dateobj);
		Calendar cal= sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, day);
	    String endDate=	sim.format(cal.getTime());
		return endDate;
		
		}
}
