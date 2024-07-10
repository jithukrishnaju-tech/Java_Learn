package com.user.multithreading;

public class Main {
    public static void main(String[] args) {
//        int threadNumber=7;
//        for (int i = 0; i < threadNumber; i++) {
//            ThreadImplementation threadImplementation = new ThreadImplementation();
//            threadImplementation.start();
//        }

//        ThreadImplementation thread1 = new ThreadImplementation();
//        ThreadImplementation thread2 = new ThreadImplementation();
//        ThreadImplementation thread3 = new ThreadImplementation();
//        ThreadImplementation thread4 = new ThreadImplementation();
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();

        Thread thread = new Thread(new Thread(new ThreadUsingRunnable()),"Login_Thread");
        Thread thread1 = new Thread(new Thread(new ThreadUsingRunnable()),"Signup_Thread");
        Thread thread2 = new Thread(new Thread(new ThreadUsingRunnable()),"Auth Thread");
        Thread thread3 = new Thread(new Thread(new ThreadUsingRunnable()),"Payment Thread");
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
