package ru.job4j.lamda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionSqrtTest {

    @Test
    public void test() {
        assertEquals(2, FunctionSqrt.calculate(4), 0.01);
        assertEquals(3, FunctionSqrt.calculate(9), 0.01);
    }

}