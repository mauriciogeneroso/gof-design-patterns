package com.generoso.study.structural.adapter.implementation;

import java.util.ArrayList;
import java.util.List;

public class NewOMS {

  private List cart = new ArrayList();
  private List payments = new ArrayList();

  public void addToBasket(Item itemJson) {
    cart.add(itemJson);
    System.out.println(itemJson.getName() + " " + itemJson.getPrice());
  }

  public void pay(Payment paymentJson) {
    payments.add(paymentJson);
    paymentJson.pay();
  }
}
