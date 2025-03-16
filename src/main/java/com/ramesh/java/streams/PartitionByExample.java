package com.ramesh.java.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByExample {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 9, 7, 6);

        Map<Boolean, List<Integer>> map = arr
                .stream()
                .collect(Collectors
                        .partitioningBy(n -> n % 2 == 0));

        System.out.println(map);
    }
}
