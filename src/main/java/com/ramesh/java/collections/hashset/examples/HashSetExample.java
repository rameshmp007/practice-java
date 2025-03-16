package com.ramesh.java.collections.hashset.examples;

import java.util.HashSet;
// HashSet: no duplicate values will be added
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // This will not be added into the HashSet

        System.out.println(set);
        set.remove("Banana");

        System.out.println(set.contains("Apple"));
        System.out.println(set.contains("Banana"));
    }
}
