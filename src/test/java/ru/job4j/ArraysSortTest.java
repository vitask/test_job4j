package ru.job4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.sort.ArraysSort;

class ArraysSortTest {

    @Test
    public void test() {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort.sort(data);
        long[] expect = {1, 2, 3};
        Assertions.assertArrayEquals(expect, result);
    }
}