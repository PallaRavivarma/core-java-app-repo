package com.sapient.aem.ui;

import java.util.Date;

/**
 * 
 * @author Srini
 * This is a demo class
 *
 *This program has following classes:
 *	built-in classes: Math, Date, String,System
 *	user-defined classes: HelloWorld
 * 
 * Access Modifiers (Visibility):
 * 		public, default(no access modifier), protected & private
 * 
 * Classes can be either public or default( package-private) whereas the members
 * of a class can be all.
 * 
 * What are members of a class:
 * 	 1. data members
 * 	 2. methods
 * 
 * HelloWorld is public class i.e. visible across all packages
 * 
 * Method signature of main()
 * 
 *  public static void main(String[] args)
 *  
 *  Here public indicates, this method is visible outside class,
 *  static indicates the method can be directly called through its class name i.e. need not
 *  create instance of the class.so that JVM can call main() directly, HelloWorld.main()
 *  
 *  void indicates return type of main() method
 *  
 *  The argument of main() is an array of String objects which are passed
 *  as command-line arguments.
 * 	
 */
public class HelloWorld {
	/*
	 * Entry-point
	 */
	public static void main(String[] args) {
		// Displaying String literal "Hello World!!"
		System.out.println("Hello World!!");
		//sqrt() is static method of Math class. Math class belongs to java.lang package
		/*
		 * A static method can be called directly through its class, ClassName.staticMethod()
		 * static methods are also called as class methods.
		 * 
		 * A instance method can be called through its object, objectName.instanceMethod()
		 */
		System.out.println("Squareroot of 5 is "+ Math.sqrt(5));
		
		/*
		 * how to create instance/object of a class
		 * 	ClassName objectName = new ClassName(); //invoking default constructor of the class
		 * 
		 */
		//today is object name
		Date today = new Date();
		System.out.println("Current Date & Time: "+ today);

	}

}
