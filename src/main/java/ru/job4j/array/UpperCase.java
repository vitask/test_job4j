package ru.job4j.array;

import java.util.Arrays;

public class UpperCase {

    public static char[] onlyLowCase(char[] input) {
        char[] res = new char[0];
        for (char c : input) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] += Character.toUpperCase(c);
            }
        }
        return res;
    }
}
