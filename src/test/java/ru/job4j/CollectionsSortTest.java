package ru.job4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class CollectionsSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList("c", "b", "a");
        List<String> expect = Arrays.asList("a", "b", "c");
        List<String> out = CollectionsSort.sort(input);
        Assertions.assertEquals(expect, out);
    }

}