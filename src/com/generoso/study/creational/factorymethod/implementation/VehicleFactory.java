package com.generoso.study.creational.factorymethod.implementation;

public class VehicleFactory {

  public Vehicle getVehicle(String vehicleType) {

    if (vehicleType == null) {
      return null;
    }

    return switch (vehicleType) {
      case "car" -> new Car();
      case "truck" -> new Truck();
      case "motorcycle" -> new Motorcycle();
      default -> throw new VehicleNotFoundException();
    };
  }
}
