package com.ramesh.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortingExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5, 6, 7, 10, 10, 11, 13, 3);

        List<Integer> ascSortedList = list.stream()
                .sorted().toList();

        List<Integer> descSortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        Integer secondMaxElement = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println(ascSortedList);
        System.out.println(descSortedList);
        System.out.println(secondMaxElement);
    }
}
