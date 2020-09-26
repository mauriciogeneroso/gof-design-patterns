package com.generoso.study.creational.builder.implementation;

public interface HouseBuilder {

  HouseBuilder buildFloor();
  HouseBuilder buildWall();
  HouseBuilder buildRoof();
  House build();
}
