package org.example.Head03.OOP.GS.example13;

public class LspTestImproved {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.getArea()); // 50

        Shape square = new Square(5);
        System.out.println("Square area: " + square.getArea()); // 25 (5x5)

    }
}