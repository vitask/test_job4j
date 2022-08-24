package ru.job4j.lamda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PredicateCheckEvenTest {

    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}