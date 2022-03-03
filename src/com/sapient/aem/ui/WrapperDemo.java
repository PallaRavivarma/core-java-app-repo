package com.sapient.aem.ui;

public class WrapperDemo {

	public static void main(String[] args) {
		try {
			//auto boxing
			Integer iobj= 100;
			//Returns the value of this Integer as an int.
			System.out.println(iobj.intValue());
			System.out.println(iobj);

			int x1 = iobj+100;
			System.out.println(x1);

			String str1= "122a";
			int x2= Integer.parseInt(str1);
			int x3= x2+5;
			System.out.println(x3);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of program");
	}

}
