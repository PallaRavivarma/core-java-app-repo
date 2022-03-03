package com.sapient.aem.ui;

import com.sapient.aem.service.MyMath;

public class MyMathDemo {

	public static void main(String[] args) {
		System.out.println("Factorial of 0 = "+ MyMath.factorial(0));
		System.out.println("Factorial of -5 = "+ MyMath.factorial(-5));
		System.out.println("Factorial of 5 = "+ MyMath.factorial(5));
		
		System.out.println(MyMath.isPrime(2));
		System.out.println(MyMath.isPrime(6));

	}

}
