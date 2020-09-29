package com.generoso.study.structural.decorator.implementation;

public class Spicy extends PizzaDecorator {

  public Spicy(Item pizza) {
    super(pizza);
  }

  @Override
  public void prepare() {
    super.prepare();
    System.out.print(" + Spicy");
  }
}
