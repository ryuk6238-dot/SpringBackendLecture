package org.example.Head03.OOP.GS.example09;

import org.example.Head03.OOP.GS.example07.Payment;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}
