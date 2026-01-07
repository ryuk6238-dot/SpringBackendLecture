package org.example.Head03.OOP.GS.example15;

public class Outer {
    private static int staticValue = 100;
    private int instanceVaule = 50;

    public static class  StaticNested {
        public void printValues() {

            System.out.println("Outer.staticValue: " + staticValue);

        }

    }
}
