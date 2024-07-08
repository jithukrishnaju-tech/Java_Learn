package com.user.abstraction;

public class Tick extends Shape {
    public Tick(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Hi I am tick");
    }
    @Override
    public int area(){
        return 1;
    }
}
