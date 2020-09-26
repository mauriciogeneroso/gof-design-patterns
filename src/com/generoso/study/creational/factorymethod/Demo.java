package com.generoso.study.creational.factorymethod;

import java.util.Scanner;
import com.generoso.study.creational.factorymethod.implementation.Vehicle;
import com.generoso.study.creational.factorymethod.implementation.VehicleFactory;
import com.generoso.study.creational.factorymethod.implementation.VehicleNotFoundException;

public class Demo {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String vehicleType = in.nextLine().toLowerCase();

    // Create a factory instance
    VehicleFactory factory = new VehicleFactory();

    try {
      // Create the appropriate vehicle
      Vehicle vehicle = factory.getVehicle(vehicleType);

      vehicle.design();
      vehicle.manufacture();
    } catch (VehicleNotFoundException ex) {
      System.err.println("Invalid vehicle");
    }

    in.close();
  }
}
