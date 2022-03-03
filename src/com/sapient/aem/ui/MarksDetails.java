package com.sapient.aem.ui;

import java.util.Arrays;
import java.util.Scanner;

public class MarksDetails {
	private static Scanner scanner= new Scanner(System.in);
			
	public static void main(String[] args) {
		System.out.println("Enter number of students..");
		Integer marks[]= new Integer[Integer.parseInt(scanner.nextLine())];
		
		enterMarks(marks);
		showMarks(marks);
		Arrays.sort(marks);
		System.out.println("\nAfter sorting..");
		showMarks(marks);
		System.out.println("-----------------------------");
		String str="Hello,Welcome,To,Java";
		String words[]= str.split(",");
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));

	}

	private static void enterMarks(Integer[] marks) {
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter marks of student: "+(i+1));
			marks[i]= Integer.parseInt(scanner.nextLine());
		}
		
	}

	private static void showMarks(Integer[] marks) {
		for(Integer m: marks) {
			System.out.print(m+" ");
		}
		
	}

}
