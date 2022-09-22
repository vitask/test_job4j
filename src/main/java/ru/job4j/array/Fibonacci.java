package ru.job4j.array;

public class Fibonacci {

    public static boolean checkArray(int[] data) {
        boolean res = true;
        for (int i = 2; i < data.length; i++) {
            if (data[i] != data[i - 1] + data[i - 2]) {
                res = false;
                break;
            }
        }
        return res;
    }
}
