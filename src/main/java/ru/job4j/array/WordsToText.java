package ru.job4j.array;

public class WordsToText {

    public static String convert(String[] words) {
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(word).append(" ");
        }
        return res.toString().trim();
    }
}
