package ru.job4j.sort;

import java.util.Arrays;

public class ArraysSort {
    public static long[] sort(long[] data) {
        return Arrays.stream(data)
                .sorted()
                .toArray();
    }
}
