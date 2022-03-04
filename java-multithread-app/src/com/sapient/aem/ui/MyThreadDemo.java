package com.sapient.aem.ui;


import com.sapient.aem.service.MyThread;

public class MyThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t1= new MyThread("worker-1");
		t1.start();//invokes run() method
		System.out.println("End of main() method");

	}
}
