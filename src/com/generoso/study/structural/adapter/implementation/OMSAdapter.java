package com.generoso.study.structural.adapter.implementation;

public class OMSAdapter {

  private NewOMS newOMS;

  public OMSAdapter() {
    newOMS = new NewOMS();
  }

  public void addItem(Item item) {
    convertXmlToJson(item);
    newOMS.addToBasket(item);
  }

  public void makePayment(Payment payment) {
    convertXmlToJson(payment);
    newOMS.pay(payment);
  }

  private void convertXmlToJson(Object o) {
    System.out.println("Converted from xml to json");
  }
}
