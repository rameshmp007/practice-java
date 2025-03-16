package com.ramesh.java.concurrency;

class MyTask implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        Thread t2 = new Thread(new MyTask());

        t1.start();
        t2.start();
    }

}
