package ru.job4j;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> res = new HashMap<>();
        for (String s : strings) {
            if (res.putIfAbsent(s, false) != null) {
                res.put(s, true);
            }
        }
        return res;
    }
}
