package edu.teamrocket;

public class CreditCard {

    private String owner;
    private String number;
    private int credit = 3000;
    private static String SYMBOL;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public int credit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String number() {
        return number;
    }

}
