package com.ramesh.java.collections.hashmap.problems;

import java.util.*;

public class Occurrence {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 9, 9, 2, 3, 2, 1);
        System.out.println(counter(list));
    }

    static Map<Integer, Integer> counter(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num: list) {
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        return map;
    }
}
