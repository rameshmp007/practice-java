package com.ramesh.java.collections.arraylist.problems;

import java.util.Arrays;

public class SortDigits {
    public static void main(String[] args) {
        Long number = 7483559895L;
        System.out.println(sortedDigitsString(number));
        sortedDigits(number);
    }

    private static Long sortedDigitsString(Long number) {
        char[] digits = number.toString().toCharArray();

        Arrays.sort(digits);

        return Long.parseLong(new String(digits));
    }

    private static void sortedDigits(Long number) {
        int size = (int) Math.log10(number) + 1;
        int[] digits = new int[size];

        for (int i = 0; i < size; i++) {
            digits[i] = (int) (number % 10);
            number /= 10;
        }

        Arrays.sort(digits);
        Long result = 0L;
        for(int i = 0; i < size; i++) {
            result = result * 10 + digits[i];
        }

        System.out.println(result);
    }
}
