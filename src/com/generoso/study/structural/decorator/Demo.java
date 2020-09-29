package com.generoso.study.structural.decorator;

import com.generoso.study.structural.decorator.implementation.DeepFried;
import com.generoso.study.structural.decorator.implementation.DoubleCheese;
import com.generoso.study.structural.decorator.implementation.Item;
import com.generoso.study.structural.decorator.implementation.Pizza;
import com.generoso.study.structural.decorator.implementation.Spicy;

public class Demo {

  public static void main(String[] args) {
    Item[] order = {
        new DeepFried(new Pizza()),
        new DeepFried(new DoubleCheese(new Pizza())),
        new DoubleCheese(new Spicy(new DeepFried(new Pizza())))
    };

    for (Item item: order) {
      item.prepare();
      System.out.println();
    }
  }
}
