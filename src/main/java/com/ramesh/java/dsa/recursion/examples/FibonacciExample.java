package com.ramesh.java.dsa.recursion.examples;

public class FibonacciExample {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    /*
    * Recurrence Relation: F(N) = F(N-1) + F(N-2)
    * Base Condition: is F(0) = 0 & F(1) = 1
    */
    public static int fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
