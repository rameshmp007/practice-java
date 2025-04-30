package com.ramesh.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","ab","c","a4d","fefsff","32","45");

        // Group the list of strings based on the length of the string
        Map<Integer, List<String>> groupByStringLength = strings
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupByStringLength);

        List<Integer> nums = List.of(3, 4, 5, 6, 7, 10);

        // Group the list of numbers based on even or odd
        Map<String, List<Integer>> groupedByEvenOdd = nums
                .stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));
        System.out.println(groupedByEvenOdd);

    }
}
