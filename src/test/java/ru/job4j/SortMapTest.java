package ru.job4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.sort.SortMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class SortMapTest {

    @Test
    public void test() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expect = new TreeMap<>(Comparator.reverseOrder());
        expect.putAll(input);
        Map<Integer, String> result = SortMap.sort(input);
        Assertions.assertEquals(expect, result);
    }
}