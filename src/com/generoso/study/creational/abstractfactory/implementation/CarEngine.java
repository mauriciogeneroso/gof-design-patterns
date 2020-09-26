package com.generoso.study.creational.abstractfactory.implementation;

class CarEngine implements Engine {

  @Override
  public void design() {
    System.out.println("Designing Car engine");
  }

  @Override
  public void manufacture() {
    System.out.println("Manufacturing Car engine");
  }

  @Override
  public void test() {
    System.out.println("Test Car engine");
  }
}
