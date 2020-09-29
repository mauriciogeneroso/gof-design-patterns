package com.generoso.study.structural.bridge.implementation;

public class Rectangle extends Shape {

  public Rectangle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.print("Rectangle Circle in");
    color.applyColor();
  }
}
