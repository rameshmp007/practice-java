package com.ramesh.java.dsa.recursion.examples;

public class NumbersExample {
    public static void main(String[] args) {
        printNumber(1);
    }

    // function to print int numbers up to 5 recursively
    public static void printNumber(int n) {
        if(n > 5)
            return;
        System.out.println(n);
        printNumber(++n);
    }
}
