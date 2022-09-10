package ru.job4j.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RetainMethodTest {

    @Test
    public void test() {
        assertEquals(List.of(1, 2, 3), Task1.retain(List.of(1, 2, 3)));
        assertEquals(List.of(1, 2, 3), Task1.retain(List.of(1, 2, 3, 4)));
        assertEquals(List.of(1, 2, 3, 5), Task1.retain(List.of(1, 2, 3, 4, 5, 8)));
        assertEquals(List.of(), Task1.retain(List.of(4, 8)));
        assertEquals(List.of(), Task1.retain(List.of()));
    }
}