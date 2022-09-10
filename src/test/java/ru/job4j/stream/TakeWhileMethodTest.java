package ru.job4j.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TakeWhileMethodTest {

    @Test
    public void test() {
        assertEquals(
                List.of(-2, -1),
                TakeWhileMethod.takeWhile(List.of(3, 2, 1, 0, -2, -1))
        );
    }
}