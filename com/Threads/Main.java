package com.Threads;

class FirstThread extends Thread{
	@Override
	public void run() {
		System.out.println("First thread message");
	}
	
}
class SecondThread extends Thread{
	@Override
	
	public void run() {
		System.out.println("second thread message");
		
	}
	
}
public class Main {
	public static void main(String[] args) {
		System.out.println("main method started ..");
		FirstThread ft=new FirstThread();
		SecondThread st=new SecondThread();
		ft.start();
		st.start();
		System.out.println("main method ended..");
	}

}
