package ru.job4j.lamda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(integer -> System.out.println("Max: " + integer));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        Arrays.sort(data);
        return Optional.of(data[data.length - 1]);
    }
}
