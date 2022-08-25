package ru.job4j.lamda;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalOrlElseTest {

    @Test
    public void test() {
        assertEquals(Integer.valueOf(-1), OptionalOrlElse.orElse(Optional.empty()));
        assertEquals(Integer.valueOf(1), OptionalOrlElse.orElse(Optional.of(1)));
    }

}