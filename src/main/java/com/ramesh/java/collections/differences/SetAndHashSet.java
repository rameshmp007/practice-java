package com.ramesh.java.collections.differences;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        hashSet.add("Cherry");
        hashSet.add("Banana");
        hashSet.add("Apple");

        System.out.println("Set: " + set);
        System.out.println("HashSet: " + hashSet);
    }
}
