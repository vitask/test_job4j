package ru.job4j.lamda;

import java.util.function.Function;

public class FunctionPow {

    public static double calculate(double x) {
         return calculate(aDouble -> aDouble * aDouble , x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
