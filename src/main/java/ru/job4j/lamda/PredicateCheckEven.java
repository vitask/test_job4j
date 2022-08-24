package ru.job4j.lamda;

import java.util.function.Predicate;

public class PredicateCheckEven {

    public static boolean check(int num) {
         return check(integer -> integer % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
