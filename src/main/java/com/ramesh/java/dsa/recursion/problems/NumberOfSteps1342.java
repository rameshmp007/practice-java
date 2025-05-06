package com.ramesh.java.dsa.recursion.problems;

public class NumberOfSteps1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num){
        if(num < 2) {
            return num;
        }
        if((num & 1) == 0) {
            return 1 + numberOfSteps(num / 2);
        } else
            return 2 + numberOfSteps((num - 1) / 2);
    }
}
