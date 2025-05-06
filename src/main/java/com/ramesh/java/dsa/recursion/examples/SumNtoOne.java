package com.ramesh.java.dsa.recursion.examples;

public class SumNtoOne {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int n) {
        if(n == 0)
            return 0;
        return n + sum(n - 1);
    }
}
