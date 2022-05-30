package com.strategy.pattern;

public class StrategyClient {
    public static void main(String [] ar){
        Order order = new Order();
        order.addItem(new Item("Italian Pizza",7.5));
        order.addItem(new Item("Wine",5.5));
        order.addItem(new Item("Beer",4.5));
        order.addItem(new Item("Apple Wine",3.5));
        order.addItem(new Item("Almonds",2.5));
        System.out.println("-------------------------------------");

        order.makPayment(new CardPayment("CREDIT","VISA",20.0));
        order.makPayment(new CardPayment("DEBIT","RUPAY",10.0));
        order.makPayment(new CashPayment(50.5));

        System.out.println("-------------------------------------");
    }
}
