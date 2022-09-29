package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        for (int j : left) {
            if (Arrays.binarySearch(right, j) < 0) {
                result[count++] = j;
            }
        }
        for (int j : right) {
            if (Arrays.binarySearch(left, j) < 0) {
                result[count++] = j;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
