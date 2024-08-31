package com.assignment;

public class multithreading_3 {

    public static class MyRunnable implements Runnable {
        private final String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
            try {
                System.out.println(threadName + " is running");
                Thread.sleep(2000);
                System.out.println(threadName + " has finished sleeping");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished");
    }
}
