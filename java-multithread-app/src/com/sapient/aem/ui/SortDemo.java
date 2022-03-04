package com.sapient.aem.ui;


import java.util.Arrays;
import java.util.Random;

public class SortDemo {

	public static void main(String[] args) {
		Integer list[]= new Integer[100000];
		Random random= new Random();
		for(int i=0;i<list.length;i++) {
			list[i]= random.nextInt();
		}
		
		// executed by main thread, instead we want 
		//sorting to be done by worker thread
		//Arrays.sort(list);
		
		
		System.out.println(System.currentTimeMillis());
		
//		//sorting is done by worker thread
//		Runnable runnable=  ()->{
//			Arrays.sort(list);
//		};
//		
//		new Thread(runnable).start();
		
		
		
		new Thread(()->{
			Arrays.sort(list);
		}).start();
		
		System.out.println(System.currentTimeMillis());
		
		

	}

}

