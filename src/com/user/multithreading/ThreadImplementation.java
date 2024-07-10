package com.user.multithreading;

public class ThreadImplementation extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("It is in " + Thread.currentThread().getName() + i);
        }
    }
}
