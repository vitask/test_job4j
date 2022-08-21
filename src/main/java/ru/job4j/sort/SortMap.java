package ru.job4j.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> res = new TreeMap<>(Comparator.reverseOrder());
        res.putAll(map);
        return res;
    }
}
