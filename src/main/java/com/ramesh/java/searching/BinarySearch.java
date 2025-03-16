package com.ramesh.java.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int element = 1;
        System.out.println(binarySearch(nums, element));
    }

    static int binarySearch(int[] arr, int ele) {
        int l = 0;
        int r = arr.length - 1;
        int mid;
        while(l <= r) {
            mid = (l + r) / 2;
            if(ele < arr[mid])
                r = mid - 1;
             else if (ele > arr[mid])
                l = mid + 1;
             else
                return mid;
        }
        return -1;
    }
}
