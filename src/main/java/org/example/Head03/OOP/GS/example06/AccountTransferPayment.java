package org.example.Head03.OOP.GS.example06;

public class AccountTransferPayment extends Payment implements org.example.Head03.OOP.GS.example07.Payment {

    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
}
