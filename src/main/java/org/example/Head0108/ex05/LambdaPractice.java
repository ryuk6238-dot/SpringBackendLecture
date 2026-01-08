package org.example.Head0108.ex05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> print = new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names. forEach(print);

        Predicate<String> lenghtCheck = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s. length() >= 5;
            }
        };

        Function<String, String> toUpper = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s. toUpperCase();
            }
        };
        names.stream().map(toUpper).forEach(System.out::println);
    }
}
