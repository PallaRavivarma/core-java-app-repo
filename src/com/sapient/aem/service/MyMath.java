package com.sapient.aem.service;
/**
 * 
 * @author Srini
 * This is a utility class containing static methods that perform
 * mathematical operations
 *
 */
public class MyMath {
	/**
	 * 
	 * @param n receives an integer value
	 * @return returns its factorial, if given number is negative
	 * return -1; if given number is 0 return 1
	 */
	public static long factorial(int n) {
		if(n<0) {
			return -1;
		}

		long fact=1;
		while(n>0) {			
			//			fact = fact*n; 
			//			n--;			
			fact *= n--;

		}
		return fact;
	}

	/**
	 * 
	 * @param n receives an integer value
	 * @return return true if the given number is prime number else
	 * returns false.
	 * A number is a prime number if it is divisible by 1 and by itself.
	 */
	public static boolean isPrime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	



}
