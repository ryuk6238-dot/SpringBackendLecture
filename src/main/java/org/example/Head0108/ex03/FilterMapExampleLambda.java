package org.example.Head0108.ex03;

import java.util.HashMap;
import java.util.Map;

public class FilterMapExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kim", 90);
        scores.put("Kim", 90);
        scores.put("Kim", 90);

        scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 80)
                .forEach(entry -> System.out.println("High Score: " + entry.getKey() + " => " + entry.getValue()));

    }
}
