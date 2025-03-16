package com.ramesh.java.streams;

import java.util.List;

public class FilterExample {
    public static void main(String[] args) {

        List<Integer> list = List.of(3, 4, 5, 6, 7, 10);

        List<Integer> evenList = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evenList);
    }
}
