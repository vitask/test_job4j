package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int index = 0;

        for(int i = 0; i < data.length - 1; i++) {
            if (data[i] <= down || data[i] >= up) {
                result[index][0] = i;
                if (data[i + 1] <= down || data[i + 1] >= up) {
                    result[index][1] = i + 1;
                    i++;
                } else {
                    result[index][1] = i;
                }
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
