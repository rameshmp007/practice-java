package com.ramesh.java.collections.hashset.problems;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 4, 5, 9, 10};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num: nums) {
            // returns true if the ele is already present
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
