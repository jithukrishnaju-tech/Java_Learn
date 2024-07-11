package com.user.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Components {
    String name;
    int price;
    List<Components> componentsList = new ArrayList<>();

    public Composite(String name, int price) {
        this.name = name;
        this.price = price;
    }
    void addComponent(Components components){
         componentsList.add(components);
    }
    public void price(){
        System.out.println("price");
    }
}
