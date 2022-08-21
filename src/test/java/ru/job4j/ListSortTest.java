package ru.job4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.sort.ListSort;

import java.util.Arrays;
import java.util.List;

class ListSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort.sort(input);
        List<String> expect = Arrays.asList("c", "b", "a", null);
        Assertions.assertEquals(expect, result);
    }
}