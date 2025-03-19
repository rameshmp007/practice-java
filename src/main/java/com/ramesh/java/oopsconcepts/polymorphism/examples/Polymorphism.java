package com.ramesh.java.oopsconcepts.polymorphism.examples;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Area 1: " + area(10, 10));
        System.out.println("Area 2: " + area(3, 4, 5));

    }

    static double area(int h, int b) {
        return h * b * 0.5;
    }

    static double area(int a, int b, int c) {
        double s = (double) (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
