package org.example.Head03.OOP.GS.example06;

public class Order {
    private  Payment payment;
    private double amount;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        this.amount = amount;
        payment.pay(amount);
    }
}
