package org.example.Head0107.ex06;

import org.example.Head03.OOP.GS.example06.Payment;

public enum PaymentMethod {
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일결제");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
