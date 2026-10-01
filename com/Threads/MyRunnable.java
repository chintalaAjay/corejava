package com.Threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Runnable thread is running");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main started..");
		MyRunnable mr=new MyRunnable();
		Thread t1=new Thread(mr);
		t1.start();
		System.out.println("main ended...");
		
		
	}

}
