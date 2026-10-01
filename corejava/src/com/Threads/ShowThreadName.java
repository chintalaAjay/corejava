package com.Threads;

public class ShowThreadName extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("main started...");
		ShowThreadName st=new ShowThreadName();
		st.start();
	}
}
