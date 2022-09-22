package ru.job4j.array;

public class ArrayWithoutEvenElements {

    public static int[] changeData(int[] data) {
        int size = 0;
        for (int i : data) {
            if (i % 2 != 0) {
                size++;
            }
        }

        int[] res = new int[size];
        int index = 0;
        for (int i : data) {
            if (i % 2 != 0) {
                res[index] = i;
                index++;
            }
        }
        return res;
    }
}

