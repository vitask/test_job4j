package ru.job4j.array;

import java.sql.Array;
import java.util.Arrays;

public class DiffArray {

    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length];
        if (result.length == 0 || result.length == 1) {
            return left;
        }

        int count = 0;
        for (int l : left) {
            result[count] = l;
            for (int r : right) {
                if (l == r) {
                    result[count] = 0;
                    break;
                }
            }
            if (result[count] != 0) {
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
