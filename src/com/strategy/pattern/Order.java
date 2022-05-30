package com.strategy.pattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List cart = new ArrayList<>();
    private List payment = new ArrayList<>();
    private final String FORMAT = "%-20s %s";
    public void addItem(Item item){
        cart.add(item);
        System.out.println(String.format(FORMAT,item.getName(),item.getPrice()));
    }
    public void makPayment(PaymentStrategy pm){
        payment.add(pm);
        pm.pay();
    }
}
