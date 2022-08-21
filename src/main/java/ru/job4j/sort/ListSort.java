package ru.job4j.sort;

import java.util.Comparator;
import java.util.List;


public class ListSort {
    public static List<String> sort(List<String> data) {
        return data.stream()
                .sorted(Comparator.nullsLast(Comparator.reverseOrder()))
                .toList();
    }
}
