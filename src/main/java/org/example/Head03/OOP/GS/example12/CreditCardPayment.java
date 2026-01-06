package org.example.Head03.OOP.GS.example12;

public class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("신용카드 결제: " + amount + "원");
    }
}

class AccountTransferPayment implements Payment {

    public void pay(double amount) {
        System.out.println("계좌이체 결제: " + amount + "원");
    }
}

class MobilePayment implements Payment {

    public void pay(double amount) {
        System.out.println("모바일 결제: " + amount + "원");
    }
}

class PaymentProcessor {
    public void pay(Payment payment, double amount) {
        payment.pay(amount);
    }
}
