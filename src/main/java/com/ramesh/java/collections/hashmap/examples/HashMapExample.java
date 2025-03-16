package com.ramesh.java.collections.hashmap.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(null, "null");
        System.out.println(map.getOrDefault(2, "N/A"));
        System.out.println(map.getOrDefault(null, "N/A"));
        System.out.println(map.getOrDefault(5, "N/A"));

        map.putIfAbsent(5, "five");
        System.out.println(map);
    }
}
