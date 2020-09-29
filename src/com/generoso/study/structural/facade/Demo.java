package com.generoso.study.structural.facade;

import com.generoso.study.structural.facade.implementation.WeddingPlanner;

public class Demo {

  public static void main(String[] args) {
    WeddingPlanner planner = new WeddingPlanner();
    planner.organize();
  }
}
