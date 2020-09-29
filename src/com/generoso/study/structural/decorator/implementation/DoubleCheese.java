package com.generoso.study.structural.decorator.implementation;

public class DoubleCheese extends PizzaDecorator {

  public DoubleCheese(Item pizza) {
    super(pizza);
  }

  @Override
  public void prepare() {
    super.prepare();
    System.out.print(" + Double Cheese");
  }
}
