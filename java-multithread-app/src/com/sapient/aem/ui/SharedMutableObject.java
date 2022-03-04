package com.sapient.aem.ui;

public class SharedMutableObject {
	//StringBuilder object is mutable and not thread-safe
	private static StringBuilder object= new StringBuilder("Welcome");
	
	public static void main(String[] args) {
		Runnable runnable = ()->{
					int length= object.length();
//					System.out.println(length);
					for(int i=0;i<length;i++) {
						System.out.println(Thread.currentThread().getName()+" "+object.append("x"));
					}
		};
		
		//Worker threads t1 and t2 are binded to same runnable object
		Thread t1= new Thread(runnable,"worker-1");
		Thread t2= new Thread(runnable,"worker-2");
		Thread t3= new Thread(runnable,"worker-3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
