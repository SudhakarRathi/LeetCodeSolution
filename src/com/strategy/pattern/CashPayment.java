package com.strategy.pattern;

public class CashPayment implements PaymentStrategy{
    private double amount;

    public CashPayment(double am){
        super();
        this.amount=am;
    }

    @Override
    public void pay() {
        System.out.println("amount "+amount);
    }
}
