package com.strategy.pattern;

public class CardPayment implements PaymentStrategy{

    private String cardType;
    private String issueer;
    private double amount;

    public CardPayment(String card,String issu,double am){
        super();
        this.cardType=card;
        this.issueer=issu;
        this.amount=am;
    }

    @Override
    public void pay() {
        System.out.println("amount "+amount+" card type "+cardType+" issuer "+issueer);
    }
}
