package ru.job4j;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySet {
    public static Set<String> sort(List<String> data) {
        return new TreeSet<>(data);
    }
}
