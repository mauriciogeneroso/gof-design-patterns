package com.generoso.study.behavioral.chainofresponsibility;

import com.generoso.study.behavioral.chainofresponsibility.implementation.CashDispenser;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        CashDispenser dispenser = new CashDispenser(100);
        dispenser.setNextDispenser(new CashDispenser(50));
        dispenser.setNextDispenser(new CashDispenser(20));
        dispenser.setNextDispenser(new CashDispenser(10));
        dispenser.setNextDispenser(new CashDispenser(5));
        dispenser.setNextDispenser(new CashDispenser(2));
        dispenser.setNextDispenser(new CashDispenser(1));

        int amount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to withdrawn: ");
        amount = scan.nextInt();

        dispenser.dispense(amount);

        scan.close();
    }
}
