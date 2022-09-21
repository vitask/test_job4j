package ru.job4j.array;

public class Validator {

    public static boolean checkArray(int[] data, int value) {
        int eql = 0;
        for (int i : data) {
            if (value == i) {
                eql++;
            }
        }
        return data.length / 2 > eql;
    }
}
