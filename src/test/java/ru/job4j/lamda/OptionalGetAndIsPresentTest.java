package ru.job4j.lamda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalGetAndIsPresentTest {

    @Test
    public void whenExist() {
        assertEquals(
                1,
                OptionalGetAndIsPresent.get(
                        new int[] {1, 2, 3},
                        2
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                -1,
                OptionalGetAndIsPresent.get(
                        new int[] {1, 2, 3},
                        4
                )
        );
    }
}