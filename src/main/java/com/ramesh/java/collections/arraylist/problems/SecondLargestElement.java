package com.ramesh.java.collections.arraylist.problems;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestElement {

    private static final String failCaseString = "No second largest element";

    public static void main(String[] args) {
        ArrayList<Integer> ex1 = new ArrayList<>(List.of(10, 5, 20, 8, 15));
        ArrayList<Integer> ex2 = new ArrayList<>(List.of(5, 4, 5));
        ArrayList<Integer> ex3 = new ArrayList<>(List.of(5, 5, 5, 5));
        ArrayList<Integer> ex4 = new ArrayList<>(List.of(5));
        ArrayList<Integer> ex5 = new ArrayList<>(List.of(-1, -2, -3, -4));
        ArrayList<Integer> ex6 = null;

        System.out.println(secondLargest(ex1));
        System.out.println(secondLargest(ex2));
        System.out.println(secondLargest(ex3));
        System.out.println(secondLargest(ex4));
        System.out.println(secondLargest(ex5));
        System.out.println(secondLargest(ex6));
    }

    static String secondLargest(ArrayList<Integer> nums) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if(nums == null || nums.size() < 2) return failCaseString;

        for (Integer num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax == Integer.MIN_VALUE
                ? failCaseString
                : "Second Largest Element: " + secondMax;
    }
}
