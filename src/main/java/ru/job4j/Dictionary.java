package ru.job4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String s : strings) {
            String firstWord = String.valueOf(s.charAt(0));
            rsl.putIfAbsent(firstWord, new ArrayList<>());
            rsl.get(firstWord).add(s);
        }
        return rsl;
    }
}
