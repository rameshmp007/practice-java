package com.ramesh.java.collections.linkedhashset.examples;

import java.util.LinkedHashSet;

/*
* What:
* Why:
* When:
* How:
*/
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("third");
        set.add("first");
        set.add("second");

        System.out.println(set);
    }
}
