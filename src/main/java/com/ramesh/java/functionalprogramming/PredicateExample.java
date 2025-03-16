package com.ramesh.java.functionalprogramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        BiPredicate<String, String> isSubstring =
                (str, subString) -> str.toLowerCase().contains(subString.toLowerCase());

        System.out.println(isEven.test(13));
        System.out.println(isSubstring.test("Ramesh", "ram"));
    }
}
