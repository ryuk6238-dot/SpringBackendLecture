package org.example.Head03.OOP.GS.example07;

public class CryptoPayment implements Payment {

    public void pay(double amount) {
        System.out.println("크립토르 " + amount + "원 결제 완료.");
    }
}
