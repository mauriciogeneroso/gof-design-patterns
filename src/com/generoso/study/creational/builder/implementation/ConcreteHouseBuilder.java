package com.generoso.study.creational.builder.implementation;

public class ConcreteHouseBuilder implements HouseBuilder {

  private House house;

  public ConcreteHouseBuilder() {
    this.house = new House();
  }

  @Override
  public HouseBuilder buildFloor() {
    house.setFloorType("concrete");
    return this;
  }

  @Override
  public HouseBuilder buildWall() {
    house.setWallType("concrete");
    return this;
  }

  @Override
  public HouseBuilder buildRoof() {
    house.setRoofType("concrete");
    return this;
  }

  @Override
  public House build() {
    return house;
  }
}
