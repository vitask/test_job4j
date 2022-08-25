package ru.job4j.lamda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

class OptionalOfAndEmptyTest {

    @Test
    public void whenExists() {
        Assertions.assertEquals(Optional.of("c"), OptionalOfAndEmpty.findValue(
                List.of("a", "b", "c"),
                "c"
        ));
    }

    @Test
    public void whenNotExists() {
        Assertions.assertEquals(Optional.empty(), OptionalOfAndEmpty.findValue(
                List.of("a", "b", "c"),
                "d"
        ));
    }
}