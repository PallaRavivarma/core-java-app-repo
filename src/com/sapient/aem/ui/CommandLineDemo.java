package com.sapient.aem.ui;
/*
 * Write a program that receives list of numbers as 
 * command-line arguments. Display its sum and average.
 */
public class CommandLineDemo {

	public static void main(String[] args) {			
		int sum=0;	
		try {
			
			for(int i=0;i<args.length;i++) {
				//convert String to Integer
				sum = sum + Integer.parseInt(args[i]);
			}
			double average = (double)sum/args.length;
			System.out.println("Sum= "+sum+"\nAverage= "+average);
			
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program terminated normally");
		

	}

}
