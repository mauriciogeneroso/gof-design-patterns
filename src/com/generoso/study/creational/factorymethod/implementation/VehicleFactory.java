package com.generoso.study.creational.factorymethod.implementation;

public class VehicleFactory {

  public Vehicle getVehicle(String vehicleType) {

    if (vehicleType == null) {
      return null;
    }

    switch (vehicleType) {
      case "car": return new Car();
      case "truck": return new Truck();
      case "motorcycle": return new Motorcycle();
      default: throw new VehicleNotFoundException();
    }
  }
}
