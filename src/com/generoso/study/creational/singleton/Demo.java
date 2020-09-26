package com.generoso.study.creational.singleton;

import com.generoso.study.creational.singleton.implementation.Singleton;

public class Demo {

  public static void main(String[] args) {
    Singleton obj1 = Singleton.getInstance();
    obj1.printObj();
    Singleton obj2 = Singleton.getInstance();
    obj2.printObj();
  }
}
