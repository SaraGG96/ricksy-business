package edu.teamrocket;

public class CrystalExpender implements GuestDispatcher {

    private int stock;
    private double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return stock;
    }

    public void dispatch(CreditCard tarjeta) {
        if (this.stock > 0 && tarjeta.pay(this.itemCost)) {
            this.stock--;
        }
    }

    @Override
    public String toString() {
        return stock + " packs, cada uno cuesta " + itemCost;
    }

}
