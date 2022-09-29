package ru.job4j.array;

public class NoConsecutive {

    public static int find(int[] data) {
        int res = -1;
        for (int i = 1; i < data.length; i++) {
            if (Math.abs(data[i] - data[i - 1]) != 1) {
                res = data[i];
                break;
            }
        }
        return res;
    }
}
