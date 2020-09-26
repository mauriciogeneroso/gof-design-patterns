package com.generoso.study.creational.abstractfactory.implementation;

class CarTyre implements Tyre {

  @Override
  public void design() {
    System.out.println("Designing Car Tyre");
  }

  @Override
  public void manufacture() {
    System.out.println("Manufacturing Car Tyre");
  }
}
