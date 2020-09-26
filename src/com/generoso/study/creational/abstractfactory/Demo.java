package com.generoso.study.creational.abstractfactory;

import java.util.Scanner;
import com.generoso.study.creational.abstractfactory.implementation.Engine;
import com.generoso.study.creational.abstractfactory.implementation.Factory;
import com.generoso.study.creational.abstractfactory.implementation.Tyre;
import com.generoso.study.creational.abstractfactory.implementation.UnknownVehicleException;

public class Demo {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String vehicleType = in.nextLine().toLowerCase();

    Factory factory = null;
    try {
      factory = Factory.getFactory(vehicleType);

      Engine engine = factory.getEngine();
      engine.design();
      engine.manufacture();
      engine.test();

      Tyre tyre = factory.getTyre();
      tyre.design();
      tyre.manufacture();
      } catch (UnknownVehicleException ex) {
      System.out.println("Invalid type");
    }

    in.close();
  }
}
