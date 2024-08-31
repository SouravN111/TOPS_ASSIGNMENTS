package com.assignment;

public class multithreading_4 extends Thread {
 
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has finished");
    }

    public static void main(String[] args) {
    	multithreading_4 t1 = new multithreading_4();

        try {
            t1.start();
            t1.start(); 
        } catch (IllegalThreadStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread is finished");
    }
}
