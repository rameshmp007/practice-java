package com.ramesh.java.math;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(1213121425));
    }

    public static int countDigits(int n) {
        return n == 0
                ? 1
                : (int) Math.floor(Math.log10(Math.abs(n))) + 1;
    }
}
