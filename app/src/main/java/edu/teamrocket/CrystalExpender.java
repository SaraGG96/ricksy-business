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

    @Override
    public void dispatch(CreditCard card) {
        if (stock > 0 && card.credit() >= itemCost) {
            card.setCredit((int) (card.credit() - itemCost));
            stock--;
        }
    }

    @Override
    public void registra(GuestDispatcher dispatcher) {
    }

    @Override
    public String toString() {
        return stock + " packs, cada uno cuesta " + itemCost;
    }

}
