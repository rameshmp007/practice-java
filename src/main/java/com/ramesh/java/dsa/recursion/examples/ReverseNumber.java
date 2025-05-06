package com.ramesh.java.dsa.recursion.examples;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    public static int reverse(int n) {
        return helper(n, (int) Math.log10(n) + 1);
    }

    public static int helper(int n, int digits) {
        if(n < 10)
            return n;
        return  (n % 10) * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}
