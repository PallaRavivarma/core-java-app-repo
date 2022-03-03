package com.sapient.aem.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * 
 * @author Srini
 * Introduced in JDK 8
 * 
 * java.time.LocalDate, java.time.LocalTime, java.time.LocalDateTime
 * Two static methods: now(), of()
 * DateTimeFormatter
 */
public class LocalDateAPI {

	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		//2022-02-25
		System.out.println(today);
		LocalDate birthdate= LocalDate.of(1998, 10,15);
		System.out.println("Birthdate: "+ birthdate);
		System.out.println("-------------------------");
		LocalTime timeNow= LocalTime.now();
		//09:44:28.868024700
		System.out.println(timeNow);
		LocalTime someTime= LocalTime.of(10, 15,30, 767879879);
		System.out.println("Time: "+ someTime);
		LocalDateTime hiredate= LocalDateTime.of(2019, 11, 1,13, 45, 30);
		//2019-11-01T13:45:30
		System.out.println(hiredate);
		
		System.out.println("Present date and time: "+LocalDateTime.now());
		
		LocalDate independeceDay= LocalDate.of(1947, 8, 15);
		
		Period period= independeceDay.until(today);
		System.out.println(period.getYears()+" years,"+period.getMonths()+" months,"+period.getDays()+" days");
	
		System.out.println("Conversions..");
		System.out.println("String to LocalDate..");
		try {
			String someDateAsString= "1994-11-06";
			LocalDate someDate= LocalDate.parse(someDateAsString);
			System.out.println(someDate);
			String someDateAsString1= "06/11/1994";
			DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate someDate1= LocalDate.parse(someDateAsString1, formatter);
			System.out.println(someDate1);
			
		}catch(DateTimeParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("LocalDate to String..");
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String todayAsString= today.format(formatter);
		System.out.println(todayAsString);
	}

}
