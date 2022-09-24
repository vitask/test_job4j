package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        List<String> l = new ArrayList<>(List.of(left.split("")));
        List<String> r = new ArrayList<>(List.of(right.split("")));
        Collections.sort(l);
        Collections.sort(r);
        return l.equals(r);
    }
}
