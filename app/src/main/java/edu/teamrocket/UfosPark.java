package edu.teamrocket;

public class UfosPark {
    private int fee = 500;

    public void add(String ufoID) {}

    public void dispatch(CreditCard card) {
        if (card.getCredit() >= fee) {
            card.setCredit(card.getCredit() - fee);
        }
    }



}
