package ru.job4j;

import org.junit.jupiter.api.Test;
import ru.job4j.sort.NaturalOrder;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaturalOrderTest {
    @Test
    public void test() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder.naturalOrder());
    }
}