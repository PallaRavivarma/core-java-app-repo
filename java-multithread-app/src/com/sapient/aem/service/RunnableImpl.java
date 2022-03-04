package com.sapient.aem.service;

/*
 * Implementation class of Runnable interface
 */
public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		//returns current Thread object
		System.out.println(Thread.currentThread());
		
	}

}

