package com.generoso.study.structural.bridge.implementation;

public class Square extends Shape {

  public Square(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.print("Square Circle in ");
    color.applyColor();
  }
}
