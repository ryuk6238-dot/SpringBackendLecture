package org.example.Head0107.ex01;

public class Main {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.printInstanceValue();
    }
}
