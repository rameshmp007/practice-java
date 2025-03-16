package com.ramesh.java.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {11, 9, 8, 7, 6, 3, 2, 1, 0, 1};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    static int[] mergeSort(int[] arr) {
        // Base condition which returns single value when only one element is there in array
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        // Send 2 copy of the array divided in half
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // return merge of both left and right array
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        // merge of both the arrays
        int[] mix = new int[first.length + second.length];

        // increment for tracking
        int i = 0;
        int j = 0;
        int k = 0;

        // assign the lowest number in both the arrays till any one of the array is completely traversed
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

        // add all the remaining elements when second array is over
        while (i < first.length) {
            mix[k++] = first[i++];
        }

        // add all the remaining elements when first array is over
        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }

}
