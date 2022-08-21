package ru.job4j.sort;

import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static List<String> sort(List<String> data) {
        return data.stream()
                .sorted()
                .toList();
    }
}
