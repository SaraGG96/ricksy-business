package edu.teamrocket;

public interface PaymentMethod {

    boolean pay(double amount);
    String number();
    String owner();

}