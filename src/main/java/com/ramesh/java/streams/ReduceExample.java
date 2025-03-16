package com.ramesh.java.streams;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5, 6, 7, 10);

        Integer sumOfList = list.stream()
                .reduce(1, (num1, num2) -> num1 * num2);

        System.out.println(sumOfList);
    }
}
