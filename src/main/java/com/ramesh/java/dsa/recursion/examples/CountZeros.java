package com.ramesh.java.dsa.recursion.examples;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(1010100));
    }
    public static int countZeros(int n) {
        if (n == 0)
            return 1;
        if (n < 10)
            return 0;
        if(n % 10 == 0)
            return 1 + countZeros(n / 10);
        else
            return countZeros(n / 10);
    }
}
