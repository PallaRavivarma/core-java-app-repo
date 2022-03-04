package com.sapient.aem.ui;

public class RunnableDemoUsingLamda {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Runnable runnable = ()->{
			System.out.println(Thread.currentThread());
			System.out.println("End of run() method");
		};
				
		Thread t1 = new Thread( runnable,"worker-1" );
		t1.start();
		System.out.println("End of main() method");

	}

}









