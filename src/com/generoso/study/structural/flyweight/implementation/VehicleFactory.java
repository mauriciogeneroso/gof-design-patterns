package com.generoso.study.structural.flyweight.implementation;

import java.util.Vector;

public class VehicleFactory {

  private Vector<Vehicle> pool = new Vector();

  public VehicleFactory() {
    for (int i = 0; i < 5; i++) {
      pool.add(new Vehicle("v" + (i + 1)));
    }
  }

  public Vehicle getVehicle(String type, String color, int speed, int duration) {
    for (Vehicle v : pool) {
      if (!v.isActive()) {
        v.setProperties(type, color, speed, duration);
        return v;
      }
    }
    return null;
  }
}