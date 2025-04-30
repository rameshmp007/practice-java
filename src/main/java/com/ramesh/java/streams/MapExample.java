package com.ramesh.java.streams;

import java.util.List;
import static com.ramesh.java.utils.Methods.checkEvenNumber;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5, 6, 7, 10);

        List<Integer> evenOnlySquareList = list.stream()
                .map(n -> checkEvenNumber(n) ? n * n : n)
                .toList();

        System.out.println(evenOnlySquareList);
    }
}
