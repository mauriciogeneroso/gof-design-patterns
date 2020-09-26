package com.generoso.study.creational.abstractfactory.implementation;

class TruckEngine implements Engine {

  @Override
  public void design() {
    System.out.println("Designing Truck engine");
  }

  @Override
  public void manufacture() {
    System.out.println("Manufacturing Truck engine");
  }

  @Override
  public void test() {
    System.out.println("Test Truck engine");
  }
}
