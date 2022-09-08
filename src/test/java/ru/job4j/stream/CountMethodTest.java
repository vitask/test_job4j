package ru.job4j.stream;

import org.junit.jupiter.api.Test;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountMethodTest {

    @Test
    public void test() {
        assertEquals(3, CountMethod.count(Stream.of(1, 2, 3)));
    }
}