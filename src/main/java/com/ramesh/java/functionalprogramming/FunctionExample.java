package com.ramesh.java.functionalprogramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> cube = a -> a * a * a;
        Function<Integer, Integer> square = a -> a * a;

        System.out.println(cube.apply(3));
        System.out.println(square.apply(5));
    }
}
