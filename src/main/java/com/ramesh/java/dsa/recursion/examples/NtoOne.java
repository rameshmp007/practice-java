package com.ramesh.java.dsa.recursion.examples;

public class NtoOne {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        fun(n - 1);
    }
}
