package com.sapient.aem.service;


public class MyThread extends Thread{
	
	public MyThread() {
		
	}
	
	public MyThread(String threadName) {
		super(threadName);
	}
	

	@Override
	public void run() {
//		super.run();
		
		System.out.println(Thread.currentThread());
		System.out.println("End of run() method");
		
	}
	

}
