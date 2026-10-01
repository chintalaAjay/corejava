package com.Threads;
class NumberPrinter implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(i+" ");
		}
		
	}
	
}

public class Main2 {
	public static void main(String[] args) {
		System.out.println("main started...");
		NumberPrinter np=new NumberPrinter();
		Thread t=new Thread(np);
		t.start();
		
		System.out.println("main ended....");
	}

}
