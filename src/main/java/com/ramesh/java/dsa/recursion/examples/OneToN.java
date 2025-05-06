package com.ramesh.java.dsa.recursion.examples;

public class OneToN {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if (n == 0)
            return;
        fun(n - 1);
        System.out.print(n + " ");
    }
}
