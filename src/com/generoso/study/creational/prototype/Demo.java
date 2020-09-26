package com.generoso.study.creational.prototype;

import com.generoso.study.creational.prototype.implementation.MachineImage;

public class Demo {

  public static void main(String[] args) throws CloneNotSupportedException {

    // Create base machine images
    MachineImage linuxVM = new MachineImage("Linux", "Symantec");
    MachineImage windowsVM = new MachineImage("Windows", "MaFee");

    // Clone linux VM and install web server
    MachineImage webServer = linuxVM.clone();
    webServer.install(" + Web Server S/W");

    // Create a copy of the web server and install application server on top of it
    MachineImage webAppServer = webServer.clone();
    webServer.install(" + App Server S/W");

    // Clone linux VM and install DB server
    MachineImage dbServer = linuxVM.clone();
    dbServer.install(" + Database Server S/W");

    // Create a test machine from windows image
    MachineImage testMachine = windowsVM.clone();

    System.out.print("Web Server configuration: ");
    webServer.printSw();
    System.out.print("App Server configuration: ");
    webAppServer.printSw();
    System.out.print("DB Server configuration: ");
    dbServer.printSw();
    System.out.print("Test machine configuration: ");
    testMachine.printSw();
  }
}
