package com.ramesh.java.charsequence;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" Ram.");
        str.setCharAt(9,'!');
        System.out.println(str);
    }
}
