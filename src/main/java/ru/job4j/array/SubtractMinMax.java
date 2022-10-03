package ru.job4j.array;

public class SubtractMinMax {

    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int anInt : ints) {
            max = Math.max(anInt, max);
            min = Math.min(anInt, min);
        }
        return max - min;
    }
}
