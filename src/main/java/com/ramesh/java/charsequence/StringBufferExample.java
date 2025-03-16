package com.ramesh.java.charsequence;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        str.append(" Ramesh.");
        str.setCharAt(12, '!');
        System.out.println(str);
    }
}
