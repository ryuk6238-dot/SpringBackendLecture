package org.example.Head03.OOP.GS.Ut;

public class Utility {
    public static final double DISCOUNT_PATE;

    static {
        DISCOUNT_PATE = 0.05;
    }

    public static double applyDiscount(double price) {
        return price - (price * DISCOUNT_PATE);
    }
}
