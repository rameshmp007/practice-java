package com.ramesh.java.dsa.recursion.examples;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12344321));
    }

    public static boolean isPalindrome(int n) {
        int reversedNumber = helper(n, (int) Math.log10(n) + 1);

        return reversedNumber == n;
    }

    public static int helper(int n, int digit) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }
}
