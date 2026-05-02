package edu.teamrocket;

public class CrystalExpender implements GuestDispatcher {

    private int stock;
    private double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard card) {
        if (stock > 0 && card.credit() >= itemCost) {
            card.setCredit((int) (card.credit() - itemCost));
            stock--;
        }
    }
}
