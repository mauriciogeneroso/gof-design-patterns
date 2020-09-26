package com.generoso.study.creational.abstractfactory.implementation;

class CarFactory extends Factory {

  @Override
  public Engine getEngine() {
    return new CarEngine();
  }

  @Override
  public Tyre getTyre() {
    return new CarTyre();
  }
}
