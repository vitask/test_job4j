package ru.job4j.lamda;

import java.util.function.Function;

public class MRFunction {
    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
