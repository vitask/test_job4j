package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NoConsecutiveTest {

    @Test
    public void test() {
        assertEquals(-1, NoConsecutive.find(new int[] {1, 2, 3}));
        assertEquals(-1, NoConsecutive.find(new int[] {}));
        assertEquals(3, NoConsecutive.find(new int[] {1, 3}));
        assertEquals(3, NoConsecutive.find(new int[] {1, 3, 4, 5}));
        assertEquals(-1, NoConsecutive.find(new int[] {1, 2, 3, 4, 5}));
    }
}