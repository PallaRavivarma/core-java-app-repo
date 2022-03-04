package com.sapient.aem.ui;
/*
 * Race condition where 2 or more threads are racing to gain control over the
 * shared object resulting inconsistent results. This is also called thread interference.
 * 
 * The code that leads to thread interference is called critical section.
 * 
 * Race condition can be avoided through synchronization.
 * Two types of synchronization:
 * 1. method-level synchronization
 * 		apply the keyword, synchronized before returnType of method definition.
 * 		Then the method is called synchronized method.
 * 	    Only one thread will enter into a synchronized method at a time so that
 *      thread interference can be avoided.
 * 2. block-level synchronization
 * 		Instead of applying synchronization for entire method, synchronize only
 *      critical section of the code. This is called synchronized block.
 *      
 *     Synchronized method :
 *     
 *     public synchronized returnType methodName(<parameters>){
 *     
 *     
 *     }
 *      
 *      Synchronized block:
 *      
 *       public returnType methodName(<parameters>){
 *     		
 *     		----------------;
 *     // synchronize only critical section to avoid thread interference
 *     	    synchronized(this){
 *             --------------------;
 *             --------------------;
 *          }
 *          
 *          --------------------;
 *     
 *     }
 *      
 */
public class SharedMutableObject1 {
	//StringBuilder object is mutable and not thread-safe
	private static StringBuilder object= new StringBuilder("Welcome");	

	public static void main(String[] args) {		
		Runnable runnable = ()->{	
//			synchronized(object) {
				int length= object.length();
				//					System.out.println(length);
				//only one thread enters into synchronized block at a time
				//avoiding thread interference

			synchronized(object) {
				for(int i=0;i<length;i++) {
					//all the threads are entering into append() method at a time
					System.out.println(Thread.currentThread().getName()+" "+ object.append("x"));
				}
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
