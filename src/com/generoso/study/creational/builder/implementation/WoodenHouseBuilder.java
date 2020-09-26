package com.generoso.study.creational.builder.implementation;

public class WoodenHouseBuilder implements HouseBuilder {

  private House house;

  public WoodenHouseBuilder() {
    this.house = new House();
  }

  @Override
  public HouseBuilder buildFloor() {
    house.setFloorType("wood");
    return this;
  }

  @Override
  public HouseBuilder buildWall() {
    house.setWallType("wood");
    return this;
  }

  @Override
  public HouseBuilder buildRoof() {
    house.setRoofType("wood");
    return this;
  }

  @Override
  public House build() {
    return house;
  }
}
