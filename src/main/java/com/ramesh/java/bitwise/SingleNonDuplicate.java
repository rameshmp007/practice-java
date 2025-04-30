package com.ramesh.java.bitwise;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        int result = nums[0];
        for(int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
