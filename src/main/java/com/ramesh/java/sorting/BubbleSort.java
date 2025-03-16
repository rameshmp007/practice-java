package com.ramesh.java.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 2, 8};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] arr) {
        int size = arr.length;
        boolean swapped;
        for(int i = 0; i < size; i++) {
            swapped = false;
            for(int j = 1; j < size - i; j++)
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            if(!swapped)
                break;
        }
    }
}
