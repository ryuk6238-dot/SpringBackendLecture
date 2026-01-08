package org.example.Head0108.ex02;

import java.util.Arrays;
import java.util.List;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "Kim", "Tommy");

        names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
