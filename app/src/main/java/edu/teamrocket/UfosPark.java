package edu.teamrocket;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    
    private int fee = 500;
    private final Map<String, String> flota = new HashMap<String, String>();

    public void add(String ufoID) {}

    public void dispatch(CreditCard card) {
        if (card.credit() >= fee) {
            card.setCredit(card.credit() - fee);
        }
    }

    public String getUfoOf(String cardNumber) {
        return flota.get(cardNumber);
    }





}
