package com.sapient.aem.ui;
/**
 * 
 * @author Admin
 * StringBuffer objects are mutable but thread-safe.
 * 
 * The methods of this class are synchronized.
 * 
 * StringBuilder objects are mutable but not thread-safe.
 * The methods of this class are not synchronized.
 * 
 * This class is useful in case single-threaded applications.
 */
public class SBTester {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("Hello");
		System.out.println(sb1);
		StringBuffer sb2= sb1.append(" Welcome");
		System.out.println(sb1);
		System.out.println(sb2);
		//insert() and delete()
		
		

	}

}
