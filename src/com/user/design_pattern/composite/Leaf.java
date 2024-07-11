package com.user.design_pattern.composite;

public class Leaf implements Components {
  String name;
  int price;

  public Leaf(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public void price() {
    System.out.println(price);
  }
}
