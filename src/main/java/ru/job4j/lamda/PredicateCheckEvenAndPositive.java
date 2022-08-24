package ru.job4j.lamda;

import java.util.function.Predicate;

public class PredicateCheckEvenAndPositive {
    public static boolean check(int num) {
         return check(integer -> integer % 2 == 0 && integer > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
