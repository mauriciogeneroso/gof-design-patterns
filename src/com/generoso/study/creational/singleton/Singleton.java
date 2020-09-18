package com.generoso.study.creational.singleton;

public class Singleton {

  // the singleton obj
  private static Singleton instance = null;

  // private constructor to avoid external instances of this class
  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        // double checking locking
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }

  public void printObj() {
    System.out.println("Unique Id of the obj: " + System.identityHashCode(this));
  }
}
