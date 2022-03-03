package com.sapient.aem.ui;

public class TwoDTester {

	public static void main(String[] args) {
		//Jagged array
		String courses[][]= {
				{"Java"},{"Java", "Java EE"},
				{"Java","Java EE","Javascript"},
				{"Java","Java EE","Javascript","HTML 5"}
				
		};
		
		for(int i=0;i<courses.length;i++) {
			for(int j=0; j<courses[i].length;j++) {
				System.out.print(courses[i][j]+" ");
			}
			System.out.println();
		}

	}

}
