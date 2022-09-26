package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AndArrayTest {

    @Test
    public void test() {
        assertArrayEquals(new int[] {}, AndArray.and(new int[] {1, 2, 3}, new int[] {4, 5}));
        assertArrayEquals(new int[] {1}, AndArray.and(new int[] {1, 2, 3}, new int[] {1, 4, 5}));
        assertArrayEquals(new int[] {4, 5}, AndArray.and(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5}));
    }
}