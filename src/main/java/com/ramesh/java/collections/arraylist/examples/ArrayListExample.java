package com.ramesh.java.collections.arraylist.examples;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(4);
        arr.add(8);
        arr.add(-1);
        arr.add(3);
        arr.add(5);

        arr.remove(4);
        arr.sort(Comparator.reverseOrder());

        arr.forEach((a) -> System.out.print(a + " "));
    }
}
