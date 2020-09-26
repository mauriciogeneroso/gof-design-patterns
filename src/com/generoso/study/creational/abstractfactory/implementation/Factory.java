package com.generoso.study.creational.abstractfactory.implementation;

public abstract class Factory {

  private static Factory carFactory = null;
  private static Factory truckFactory = null;

  public abstract Engine getEngine();

  public abstract Tyre getTyre();

  public static Factory getFactory(String vehicleType) throws UnknownVehicleException {

    if (vehicleType == null) {
      return null;
    }

    switch (vehicleType) {
      case "car" -> {
        if (carFactory == null) {
          carFactory = new CarFactory();
        }
        return carFactory;
      }
      case "truck" -> {
        if (truckFactory == null) {
          truckFactory = new TruckFactory();
        }
        return truckFactory;
      }
      default -> throw new UnknownVehicleException();
    }
  }
}
