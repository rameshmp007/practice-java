package com.ramesh.java.dsa.recursion.examples;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 11, 12, 15};
        int target = 12;

        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    /*
    * Recurrence Relation: B(N) = O(1) + F(N/2)
    *
    */
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if(left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }

}
