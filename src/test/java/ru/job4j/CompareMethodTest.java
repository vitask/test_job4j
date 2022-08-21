package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareMethodTest {
    @Test
    public void testAscending() {
        assertEquals(0, CompareMethod.ascendingCompare(1, 1));
        assertEquals(-1, CompareMethod.ascendingCompare(1, 2));
        assertEquals(1, CompareMethod.ascendingCompare(2, 1));
    }

    @Test
    public void testDescending() {
        assertEquals(0, CompareMethod.descendingCompare(1, 1));
        assertEquals(1, CompareMethod.descendingCompare(1, 2));
        assertEquals(-1, CompareMethod.descendingCompare(2, 1));
    }

}