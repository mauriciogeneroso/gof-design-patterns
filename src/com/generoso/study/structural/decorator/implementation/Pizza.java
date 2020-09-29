package com.generoso.study.structural.decorator.implementation;

public class Pizza implements Item {

  @Override
  public void prepare() {
    System.out.print("Pizza");
  }
}
