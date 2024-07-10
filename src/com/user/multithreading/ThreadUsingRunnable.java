package com.user.multithreading;

public class ThreadUsingRunnable implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " From thread " + Thread.currentThread().getName());
        }
    }

}
