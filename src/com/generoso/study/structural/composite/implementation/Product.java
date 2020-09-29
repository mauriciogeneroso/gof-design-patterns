package com.generoso.study.structural.composite.implementation;

public class Product implements Item {

  private int id;

  public Product(int id) {
    this.id = id;
  }

  @Override
  public void print(int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("   ");
    }
    System.out.println("Product " + id);
  }
}
