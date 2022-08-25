package ru.job4j.lamda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        return indexOf(data,el).isEmpty() ? -1 : indexOf(data,el).get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}