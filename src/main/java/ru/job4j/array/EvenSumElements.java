package ru.job4j.array;

public class EvenSumElements {

    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum % 2 == 0;
    }
}
