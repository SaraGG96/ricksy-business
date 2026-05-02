package edu.teamrocket;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    
    private int fee = 500;
    private final Map<String, String> flota = new HashMap<String, String>();

    public UfosPark() {}

    public void add(String ufoID) {}

    @Override
    public void dispatch(CreditCard card) {
        if (card.credit() >= fee) {
            card.setCredit(card.credit() - fee);
            flota.put(card.number(), "UFO-" + (flota.size() + 1));
        }
    }

    @Override
    public void registra(GuestDispatcher dispatcher) {
    }


    public String getUfoOf(String cardNumber) {
        return flota.get(cardNumber);
    }

    @Override
    public String toString() {
        return "UfosPark con " + flota.size() + " ufos alquilados.";
    }




}
