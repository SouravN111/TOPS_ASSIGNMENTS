package com.assignment;


class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t=new Thread(this, "Child thread");
		t.start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(t + " : " + i);
				Thread.sleep(500);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
	
}


public class multithreading_1 {
	public static void main(String[] args) {
		new NewThread();
		
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
