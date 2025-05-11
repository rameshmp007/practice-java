package com.ramesh.java.dsa.strings.patterns.stringmanipulation;

import java.util.List;

public class LongestEvenWord {
    public static void main(String[] args) {
        String sentence =
                "Be not afraid of greatness, some are born great, some achieve greatness, and some have greatness thrust upon them.";
        System.out.println(findWord(sentence));
    }

    public static String findWord(String sentence) {
        String sentenceNoComma = sentence.replace(",", "");
        String sentenceNoCommaAnsDot = sentenceNoComma.replace(".", "");
        List<String> words = List.of(sentenceNoCommaAnsDot.split(" "));
        int maxEvenLength = 0;
        String maxEvenWord = "";
        for (String word : words) {
            int tempEvenLength = 0;
            String tempEvenWord = "";
            if((word.length() & 1) == 0) {
                tempEvenLength = word.length();
                tempEvenWord = word;
            }
            if (tempEvenLength > maxEvenLength) {
                maxEvenWord = tempEvenWord;
                maxEvenLength = tempEvenLength;
            }
        }

        return maxEvenWord;
    }
}
