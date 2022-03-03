package com.sapient.aem.ui;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s1=new String("Hello Welcome#");
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("l"));
		
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		//lower-index inclusive, upper-index exclusive
		System.out.println(s1.substring(3,9));
		
		System.out.println(s1.contains("come"));
		
		String pattern= "^[a-zA-Z\\s]+$";
		System.out.println(s1.matches(pattern));
		long mobile= 9678567680L;
		Long mobile1= mobile;//auto-boxing
		String mob= mobile1.toString();
		String pat = "^[0-9]{10}$";
		System.out.println(mob.matches(pat));
		
		String id= "1234ECAEMSL7897979";
//		String eid = id.split("EC")[0];
//		int empno= Integer.parseInt(eid);
		
		int empno= Integer.parseInt(id.split("EC")[0]);
		System.out.println(empno);
		
		String dept = id.split("EC")[1].split("SL")[0];
		System.out.println(dept);
	
		double sal= Double.parseDouble( id.split("SL")[1]);
		System.out.println(sal);

	}

}
