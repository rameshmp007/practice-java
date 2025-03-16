package com.ramesh.java.streams;

import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5, 6, 7, 10);

        List<Integer> evenOnlySquareList = list.stream()
                .map(n -> n % 2 == 0 ? n * n : n)
                .toList();

        System.out.println(evenOnlySquareList);
    }
}
