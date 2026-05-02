package edu.teamrocket;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
    
    private double fee = 500.0;
    private final Map<String, String> flota = new HashMap<String, String>();

    public UfosPark() {
        
    }

    public void add(String ovni) {
        flota.put(ovni, null);
    }

    public void dispatch(CreditCard card) {
            if (!flota.containsValue(card.number())) {
                for (Map.Entry<String, String> entry : flota.entrySet()) {
                    if (entry.getValue() == null) {
                        if (card.pay(fee)) {
                            flota.put(entry.getKey(), card.number());
                            break;
                        }
                    }
                }
            }
        }

    public String getUfoId(String cardNumber) {
        String ufoId = "0";
        for (Map.Entry<String, String> entry : flota.entrySet()) {
            if (cardNumber.equals(entry.getValue()) ) {
                ufoId = entry.getKey();
                break;
            }
        }
        return ufoId;
    }

    @Override
    public String toString() {
        return "UfosPark con " + flota.size() + " ufos alquilados.";
    }




}
