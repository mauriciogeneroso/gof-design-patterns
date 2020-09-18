package com.generoso.study.creational.builder;


public class Demo {

  public static void main(String[] args) {

    // concrete house
    HouseBuilder builder = new ConcreteHouseBuilder();
    HouseBuildDirector director = new HouseBuildDirector(builder);
    System.out.println(director.construct());

    // wooden house
    builder = new WoodenHouseBuilder();
    director = new HouseBuildDirector(builder);
    System.out.println(director.construct());

  }
}
