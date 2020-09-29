package com.generoso.study.structural.decorator.implementation;

public class PizzaDecorator implements Item {

  private Item pizza;

  public PizzaDecorator(Item pizza) {
    this.pizza = pizza;
  }

  @Override
  public void prepare() {
    pizza.prepare();
  }
}
