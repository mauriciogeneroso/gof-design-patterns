package com.generoso.study.structural.facade.implementation;

public class WeddingPlanner {

  // Facade class to hide the complexity

  private Hall hall;
  private Restaurant restaurant;
  private Photographer photographer;
  private Vehicle vehicle;

  public WeddingPlanner(){
    hall = new Hall();
    restaurant = new Restaurant();
    photographer = new Photographer();
    vehicle = new Vehicle();
  }

  public void organize() {
    hall.book();
    restaurant.placeOrder();
    photographer.book();
    vehicle.reserve();
  }
}
