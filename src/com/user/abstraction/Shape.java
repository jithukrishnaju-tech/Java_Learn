package com.user.abstraction;

public abstract class Shape {
    String name;
    int sides;
    abstract void makeSound();
    public abstract int area();
    public Shape(String name){
        this.name=name;
    }
    public Shape(int sides){
        this.sides=sides;
    }
    public Shape(String name, int sides){
        this.name=name;
        this.sides=sides;
    }
}
