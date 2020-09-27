package com.generoso.study.structural.adapter.implementation;

import java.util.ArrayList;
import java.util.List;

public class LegacyOMS {

  private List cart = new ArrayList();
  private List payments = new ArrayList();

  public void addItem(Item itemXml) {
    cart.add(itemXml);
    System.out.println(itemXml.getName() + " " + itemXml.getPrice());
  }

  public void makePayment(Payment paymentXml) {
    payments.add(paymentXml);
    paymentXml.pay();
  }
}
