package com.ramesh.java.dsa.recursion.examples;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(productOfDigits(126345));
    }

    public static int productOfDigits(int n) {
        if(n < 10)
            return n;
        return n % 10 * productOfDigits(n / 10);
    }
}
