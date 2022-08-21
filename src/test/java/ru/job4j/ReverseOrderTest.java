package ru.job4j;

import org.junit.jupiter.api.Test;
import ru.job4j.sort.ReverseOrder;

import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseOrderTest {

    @Test
    public void test() {
        assertEquals(Comparator.reverseOrder(), ReverseOrder.reverseOrder());
    }
}