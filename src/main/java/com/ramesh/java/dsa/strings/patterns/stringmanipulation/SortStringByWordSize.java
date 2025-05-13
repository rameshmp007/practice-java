package com.ramesh.java.dsa.strings.patterns.stringmanipulation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortStringByWordSize {
    public static void main(String[] args) {
        String str = "This is amazing";

        String result = Arrays
                .stream(str.split(" "))
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
