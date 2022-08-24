package ru.job4j.lamda;

import java.util.function.Function;

public class FunctionSqrt {

    public static double calculate(double x) {
        return calculate(Math::sqrt, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
