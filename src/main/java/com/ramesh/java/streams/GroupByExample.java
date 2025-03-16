package com.ramesh.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","ab","c","a4d","fefsff","32","45");

        Map<Integer, List<String>> map = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);


        List<Integer> list2 = List.of(3, 4, 5, 6, 7, 10);

        Map<String, List<Integer>> groupedNumbers = list2
                .stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));

        System.out.println(groupedNumbers);

    }
}
