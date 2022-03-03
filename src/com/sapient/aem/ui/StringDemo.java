package com.sapient.aem.ui;
/**
 * 
 * @author Admin
 *  String class objects are immutable hence thread-safe.
 *  String objects are read-only objects
 */
public class StringDemo {

	public static void main(String[] args) {
		try {
			String s1= "Hello";
			String s2="Hello";
			String s3= new String("Hello");
			String s4= new String("Hello");
			
			System.out.println(s1==s2);//true
			System.out.println(s1.equals(s2)); //true
			System.out.println("-------------------");
			System.out.println(s3==s4); //false
			System.out.println(s3.equals(s4));	 //true		
			System.out.println("-----------------------------");
			/*
			 * Every object has a hashcode. The JVM generated 
			 * hashcode is always unique.
			 * 
			 * If two objects of same type have same data then it is a good practice
			 * to have same hashcode. To acheive this, override equals() and
			 * hashCode() methods of Object class.
			 * 
			 * The String class has already overridden these two methods so
			 * that if the String objects have same data then their hashcodes
			 * are same.
			 */
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s3.hashCode());
			System.out.println(s4.hashCode());
			
			
		}catch(Exception e) {
			
		}

	}

}
