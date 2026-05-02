package edu.teamrocket;

public class CreditCard {

    private String owner;
    private String number;
    private double credit;
    private final String SYMBOL = "EZIS";


    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
        this.credit = 3000.0;
    }

    public boolean pay(double amount) {
        if (credit >= amount) {
            this.credit = this.credit - amount;
            return true;
        }
        else {
            return false;
        }
    }

    public double credit() {
        return credit;
    }

    public String number() {
        return number;
    }

    public String owner() {
        return owner;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    @Override
    public String toString() {
        return owner + " - " + number + " - " + credit + SYMBOL;
    }

}
