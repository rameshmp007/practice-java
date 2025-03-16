package com.ramesh.java.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 2, 8};
        int searchElement = 7;
        System.out.println(linearSearch(nums, searchElement));
    }

    static int linearSearch(int[] arr, int element) {
        for(int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                return i;
        return -1;
    }
}
