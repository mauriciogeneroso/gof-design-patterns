package com.generoso.study.structural.flyweight;

import java.util.Random;
import com.generoso.study.structural.flyweight.implementation.Vehicle;
import com.generoso.study.structural.flyweight.implementation.VehicleFactory;

public class Demo {

  private static Random random = new Random();

  private static final String[] types = {"bus", "truck", "car"};
  private static final String[] colors = {"red", "green", "blue"};
  private static int[] speeds = {50, 30, 80};

  public static void main(String[] args) throws InterruptedException {

    VehicleFactory factory = new VehicleFactory();

    for (int i = 0; i < 20; i++) {
      Vehicle v = factory
          .getVehicle(getRandType(), getRandColor(), getRandSpeed(),
              random.nextInt(5) + 1);

      if (v != null) {
        System.out.println("Vehicle " + (i + 1));
        v.addToTraffic();
      } else {
        i--;
        Thread.sleep(1000);
      }
    }
  }

  public static String getRandType() {
    return types[random.nextInt(types.length)];
  }

  public static String getRandColor() {
    return colors[random.nextInt(colors.length)];
  }

  public static int getRandSpeed() {
    return speeds[random.nextInt(speeds.length)];
  }
}
