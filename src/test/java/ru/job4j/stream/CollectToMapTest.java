package ru.job4j.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectToMapTest {

    @Test
    public void test() {
        List<Integer> data = List.of(2, 3);
        Map<Integer, Integer> expect = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = CollectToMap.collect(data.stream());
        assertEquals(expect, result);
    }
}