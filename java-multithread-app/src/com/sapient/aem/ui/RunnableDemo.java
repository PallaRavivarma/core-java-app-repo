package com.sapient.aem.ui;

import com.sapient.aem.service.RunnableImpl;

public class RunnableDemo {
	/*
	 * main() method is executed by main thread.
	 * JVM creates main thread when it enters into main() and hand over
	 * the control to main thread. Now the main thread will run the statements
	 * in the main method.
	 * 
	 * The main can spawn/generate worker/user threads.
	 */
	public static void main(String[] args) {
		try {
			System.out.println(Thread.currentThread());
			
			//Creating Runnable object
			Runnable runnable= new RunnableImpl();
			/* Pass Runnable object to  Thread object during its creation.
			 * This way we are binding the Runnable object to Thread object.
			 */
			Thread t1= new Thread(runnable);
			//start the thread
			/*
			 * At this point, main thread will spawn worker thread and this
			 * worker thread will enter into the run() method are start
			 * executing the statements in the run() method. Meanwhile
			 * main thread will continue executing the remaining statements
			 * of the main() method.
			 * 
			 * start() method will implicitly call the run() method
			 */
			t1.start();
			
			System.out.println("End of main() method");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
