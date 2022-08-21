package ru.job4j.sort;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    public static Set<String> sort(List<String> list) {
        Set<String> res = new TreeSet<>(Comparator.reverseOrder());
        res.addAll(list);
        return res;

    }
}
