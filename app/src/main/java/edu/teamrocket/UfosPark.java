package edu.teamrocket;

public class UfosPark {
    
    private int fee = 500;
    private String[] ufosID = new String[10];

    public void add(String ufoID) {}

    public void dispatch(CreditCard card) {
        if (card.credit() >= fee) {
            card.setCredit(card.credit() - fee);
        }
    }

    public String getUfoOf(String cardNumber) {
        return "unx";
    }





}
