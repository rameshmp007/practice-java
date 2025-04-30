package com.ramesh.java.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Methods {

    /*
    * checks if a given number is even or not
    * @param number: given number
    * @return boolean true if number is even or false
    */
    public static boolean checkEvenNumber(int number) {
        return (number & 1) == 0;
    }
}
