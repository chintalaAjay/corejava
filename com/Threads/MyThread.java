package com.Threads;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello from MyThread");
		}
	}
	public static void main(String[] args) {
		MyThread m=new MyThread();
		System.out.println("main started...");
		m.start();
		System.out.println("main ended..");
	}

}

