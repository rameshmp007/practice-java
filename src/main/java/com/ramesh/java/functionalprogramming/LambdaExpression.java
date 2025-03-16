package com.ramesh.java.functionalprogramming;

public class LambdaExpression {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 6;
        MathOperations add = (a, b) -> a + b;
        MathOperations subtract = (a, b) -> a - b;
        MathOperations multiply = (a, b) -> a * b;
        MathOperations average = (a, b) -> (a + b) / 2;
        System.out.println("Addition: " + add.operate(num1, num2));
        System.out.println("Subtraction: " + subtract.operate(num1, num2));
        System.out.println("Multiplication: " + multiply.operate(num1, num2));
        System.out.println("Average: " + average.operate(num1, num2));
    }

    interface MathOperations{
        int operate(int a, int b);
    }
}
