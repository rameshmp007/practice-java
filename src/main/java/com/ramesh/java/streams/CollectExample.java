package com.ramesh.java.streams;

import java.util.List;
import java.util.stream.Collectors;

// Write a program to merge List<String> into a single String using streams
public class CollectExample {
    public static void main(String[] args) {
        List<String> str = List.of("Be", "not", "afraid", "of", "greatness");

        String result = str.stream().collect(Collectors.joining(" "));

        //Other method
        String result2 = String.join(" ", str);

        System.out.println(result);
        System.out.println(result2);
    }
}
