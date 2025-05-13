package com.ramesh.java.exampleproblems;

import java.util.*;
import java.util.stream.Collectors;


public class GroupAnagramsProblem {
    public static void main(String[] args) {
        List<String> strs = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        String[] strArray = {"eat", "tea", "tan", "ate", "nat", "bat"};

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

        System.out.println(groupAnagrams(strArray));
    }

    public static List<List<String>> groupAnagrams(String[] strArray) {
        Map<String, List<String>> groupedMap = new HashMap<>();

        for(String str : strArray) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            groupedMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groupedMap.values());
    }
}
