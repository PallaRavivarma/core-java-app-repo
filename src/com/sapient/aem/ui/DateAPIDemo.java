package com.sapient.aem.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author Srini
 * Date API 
 * 		java.util.Date, java.util.Calendar, java.util.GregorianCalendar
 * 
 *    java.util.Date has only 2 constructors
 *    	Date(), Date(timeInMillis)
 *    
 *    Alternate for Date is LocalDate.
 *    
 *    Calendar is an abstract class which cannot be instantiated.
 *    GregorianCalendar is a concrete sub class of Calendar class
 *    which can be instantiated.
 *    
 *    Calendar class has a static method, getInstance() which returns
 *    GregorianCalendar object containing current date and time
 */
public class DateAPIDemo {

	public static void main(String[] args) {
		Date today= new Date(); //default or no-arg constructor
		System.out.println(today);
		
		//returns new Date which is EPOCH+ the given time in ms
		//EPOCH is java base time line, In Java epoch is
		// 1st January 1970 00:00:00 GMT
		Date someDate= new Date(1000*60*60*24*365L);
		System.out.println(someDate);
		//returns time in ms from epoch to today
		Long currentDateInMillis= today.getTime();
		System.out.println(currentDateInMillis);
		
		if(today.after(someDate)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		System.out.println(someDate.getYear());
		
		System.out.println("--------------------------------");
		
		Calendar today1 = Calendar.getInstance();
		//String representation of GregorianCalendar object is displayed
		System.out.println(today1);
		System.out.println(today1.get(Calendar.DATE));
		
		Calendar birthdate= new GregorianCalendar(1998,10,15,10,15,30);
		System.out.println("Birthdate: "+ birthdate);		
		System.out.println("SimpleDateFormat class Example");
		
		try {
			SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
			// to convert String to Date and vice-versa
			//SimpleDateFormat contains following methods
			// 1. parse() : convert String->Date
			//2. format(): convert Date->String			
			//convert String -> Date
			String hdate= "2019-10-15";			
			Date hiredate= simpleDateFormat.parse(hdate);
			System.out.println(hiredate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			//Date -> String
			SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
			String todayAsString= sdf.format(today);
			System.out.println(todayAsString);
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
