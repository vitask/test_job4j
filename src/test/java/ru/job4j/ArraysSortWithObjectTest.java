package ru.job4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraysSortWithObjectTest {
    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
        String[] expect = {"c", "b", "a"};
        Assertions.assertArrayEquals(expect, result);
    }
}