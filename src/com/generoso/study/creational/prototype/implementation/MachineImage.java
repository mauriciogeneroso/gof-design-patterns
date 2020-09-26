package com.generoso.study.creational.prototype.implementation;

public class MachineImage implements Cloneable {

  private StringBuilder image;

  public MachineImage(String os, String antivirusSW) {
    image = new StringBuilder();
    image.append(os).append(" + " + antivirusSW);
  }

  public MachineImage(String sw) {
    image = new StringBuilder(sw);
  }

  public void install(String sw) {
    image.append(sw);
  }

  public void printSw() {
    System.out.println(image);
  }

  @Override
  public MachineImage clone() throws CloneNotSupportedException {
    return new MachineImage(this.image.toString());
  }
}
