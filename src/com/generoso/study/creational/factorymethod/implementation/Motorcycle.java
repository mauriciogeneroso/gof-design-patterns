package com.generoso.study.creational.factorymethod.implementation;

class Motorcycle implements Vehicle{

  @Override
  public void design() {
    System.out.println("Designing Motorcicle");
  }

  @Override
  public void manufacture() {
    System.out.println("Manufacturing Motorcicle");
  }
}
