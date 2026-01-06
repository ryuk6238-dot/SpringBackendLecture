package org.example.Head03.OOP.GS.example06;

public class CreditCardPayment extends Payment implements org.example.Head03.OOP.GS.example07.Payment {

    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}
