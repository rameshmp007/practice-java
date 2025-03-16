package com.ramesh.java.exampleproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GroupAnagramsProblem {
    public static void main(String[] args) {
        List<String> strs = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        List<List<String>> groupedList = strs
                .stream()
                .collect(Collectors.groupingBy((str) -> Arrays
                        .stream(str.split(""))
                        .sorted()
                        .toList()))
                .values()
                .stream()
                .toList();

        System.out.println(groupedList);
    }
}
