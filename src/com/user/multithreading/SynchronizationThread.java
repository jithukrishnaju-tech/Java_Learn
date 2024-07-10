package com.user.multithreading;

class Value {
    private int value = 0;
    public synchronized void increment() {
        value++;
    }
    public int getValue() {
        return value;
    }
}
class CounterIncrementer implements Runnable {
    private final Value value;
    public CounterIncrementer(Value value) {
        this.value = value;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            value.increment();
        }
    }
}
public class SynchronizationThread {
    public static void main(String[] args) throws InterruptedException {
        Value value = new Value();
        Thread thread1 = new Thread(new CounterIncrementer(value), "Thread-1");
        Thread thread2 = new Thread(new CounterIncrementer(value), "Thread-2");
        Thread thread3 = new Thread(new CounterIncrementer(value), "Thread-3");
        thread1.start();
        thread2.start();
        thread3.start();

            thread1.join();
            thread2.join();
            thread3.join();

        System.out.println(value.getValue());
    }
}
