package com.generoso.study.structural.bridge;

import com.generoso.study.structural.bridge.implementation.Circle;
import com.generoso.study.structural.bridge.implementation.Green;
import com.generoso.study.structural.bridge.implementation.Rectangle;
import com.generoso.study.structural.bridge.implementation.Red;
import com.generoso.study.structural.bridge.implementation.Shape;
import com.generoso.study.structural.bridge.implementation.Square;

public class Demo {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[]{
        new Circle(new Red()),
        new Square(new Red()),
        new Rectangle(new Green())
    };

    for (Shape shape : shapes) {
      shape.draw();
    }
  }
}
