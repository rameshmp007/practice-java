package com.ramesh.java.dsa.recursion.examples;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1346925));
    }

    public static int sumOfDigits(int n) {
        if(n < 10)
            return n;

        return n % 10 + sumOfDigits(n / 10);
    }
}
