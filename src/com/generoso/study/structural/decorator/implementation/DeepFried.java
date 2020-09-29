package com.generoso.study.structural.decorator.implementation;

public class DeepFried extends PizzaDecorator {

  public DeepFried(Item pizza) {
    super(pizza);
  }

  @Override
  public void prepare() {
    super.prepare();
    System.out.print(" + Deep Fried");
  }
}
