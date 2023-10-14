package com.example.mipt_lab2;

public class TextCounter {
    public static int countSymbols(String phrase){
        return phrase.length();
    }

    public static int countWords(String phrase){
        String[] words = phrase.split("[\\s,\\.]+");
        return words.length;
    }
}
