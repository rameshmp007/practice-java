package com.ramesh.java.streams;

import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5, 6, 7, 10, 10, 3);

        List<Integer> distinctList = list.stream().distinct().toList();

        System.out.println(distinctList);
    }
}
