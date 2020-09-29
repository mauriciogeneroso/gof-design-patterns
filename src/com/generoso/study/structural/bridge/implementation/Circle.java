package com.generoso.study.structural.bridge.implementation;

public class Circle extends Shape {

  public Circle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.print("Draw Circle in");
    color.applyColor();
  }
}
