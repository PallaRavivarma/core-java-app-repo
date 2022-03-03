package com.sapient.aem.ui;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDTester {
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Initiaization ....");
		String courses[] = {"Java","Java EE","Javascript","HTML 5","CSS 3"};
		
		System.out.println("for each loop...");
		for(String c: courses) {
			System.out.println(c);
		}
		
		System.out.println("Accepting input...");
		System.out.println("Enter number of courses..");
		
//		int ne= scanner.nextInt();
//		scanner.nextLine();
		
		//accepting numeric data as String and converting to int
		int ne = Integer.parseInt(scanner.nextLine());
		
		String course[]= new String[ne];
		for(int i=0;i<course.length;i++) {
			System.out.println("Enter course: "+ (i+1));
			course[i]=scanner.nextLine();
		}
		
		System.out.println("Course list...");
		for(String s: course) {
			System.out.println(s);
		}
		
		System.out.println("Built-in utility class: Arrays");
		
		System.out.println(Arrays.toString(courses));	
		System.out.println("After sorting..");
		Arrays.sort(courses);		
		System.out.println(Arrays.toString(courses));
		

	}

}
