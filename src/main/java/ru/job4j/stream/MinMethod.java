package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;

public class MinMethod {

    public static String min(List<String> strings) {
        return strings
                .stream()
                .min(Comparator.comparing(String::length))
                .get();
    }
}
