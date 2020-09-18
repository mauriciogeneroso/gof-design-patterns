package com.generoso.study.creational.builder;

public interface HouseBuilder {

  HouseBuilder buildFloor();
  HouseBuilder buildWall();
  HouseBuilder buildRoof();
  House build();
}
