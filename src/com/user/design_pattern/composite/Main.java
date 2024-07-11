package com.user.design_pattern.composite;

public class Main {
    public static void main(String[] args) {
        Components mouse = new Leaf("mouse",3000);
        Components monitor = new Leaf("monitor",30000);
        Components keybord = new Leaf("keybord",30);
        Components printer = new Leaf("printer",300);
        Composite computer = new Composite("Computer", 500000);
        Composite motherBoard = new Composite("MotherBoard", 50000);
        computer.addComponent(mouse);
        computer.addComponent(printer);
        computer.price();
    }
}
