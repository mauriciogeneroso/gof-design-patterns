package com.generoso.study.structural.adapter;

import com.generoso.study.structural.adapter.implementation.Item;
import com.generoso.study.structural.adapter.implementation.LegacyOMS;
import com.generoso.study.structural.adapter.implementation.OMSAdapter;
import com.generoso.study.structural.adapter.implementation.Payment;

public class Demo {

  public static void main(String[] args) {

    // Old application
    LegacyOMS oms = new LegacyOMS();
    oms.addItem(new Item("Italian Pizza", 6.99));
    oms.addItem(new Item("Wine", 9.99));
    oms.addItem(new Item("Beer", 5.99));
    oms.addItem(new Item("Red Apple", 1.49));
    oms.addItem(new Item("Almonds", 11.99));

    System.out.println("---------------");
    oms.makePayment(new Payment("CASH", 20));
    oms.makePayment(new Payment("CREDIT", 10));
    oms.makePayment(new Payment("DEBIT", 10));

    System.out.println();
    // ---------------------
    // New application after apply adapter
    OMSAdapter adapter = new OMSAdapter();

    adapter.addItem(new Item("Italian Pizza", 6.99));
    adapter.addItem(new Item("Wine", 9.99));
    adapter.addItem(new Item("Beer", 5.99));
    adapter.addItem(new Item("Red Apple", 1.49));
    adapter.addItem(new Item("Almonds", 11.99));

    System.out.println("---------------");
    adapter.makePayment(new Payment("CASH", 20));
    adapter.makePayment(new Payment("CREDIT", 10));
    adapter.makePayment(new Payment("DEBIT", 10));
  }
}