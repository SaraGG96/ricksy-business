package edu.teamrocket;
import edu.teamrocket.CreditCard;

public class UfosPark {

    private int fee = 500;

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
