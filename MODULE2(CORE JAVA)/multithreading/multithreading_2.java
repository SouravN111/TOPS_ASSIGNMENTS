package com.assignment;


class NewThread2 extends Thread{
	NewThread2(){
		super("Child Thread");
		start();
	}
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
//				System.out.println(t + " : " + i);
				Thread.sleep(500);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
	
}


public class multithreading_2 {
	public static void main(String[] args) {
		new NewThread2();
		
		Thread t=Thread.currentThread();

		try {
			for(int i=0;i<5;i++) {
				System.out.println(t + " : " + i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exiting");
	}
}
