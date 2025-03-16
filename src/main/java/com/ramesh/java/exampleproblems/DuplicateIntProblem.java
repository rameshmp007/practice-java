package com.ramesh.java.exampleproblems;

import java.util.HashMap;

public class DuplicateIntProblem {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4};

        System.out.println(duplicateInt(arr));
        System.out.println(duplicateIntMap(arr));
    }

    static int duplicateInt(int[] arr) {
        int arrSize = arr.length;
        int arrSum = 0;
        for (int a: arr)
            arrSum += a;

        int naturalNumberSum = (arrSize * (arrSize - 1)) / 2;

        return arrSum - naturalNumberSum;
    }

    static int duplicateIntMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a: arr) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                return a;
            }
        }
        return -1;
    }
}
