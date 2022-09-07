package ru.job4j.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SummingMethodTest {

    @Test
    public void test() {
        SummingMethod.Bill b1 = new SummingMethod.Bill(1);
        SummingMethod.Bill b2 = new SummingMethod.Bill(2);
        SummingMethod.Bill b3 = new SummingMethod.Bill(3);
        SummingMethod.Bill b4 = new SummingMethod.Bill(4);
        SummingMethod.Bill b5 = new SummingMethod.Bill(5);
        SummingMethod.Bill b6 = new SummingMethod.Bill(6);
        SummingMethod.User u1 = new SummingMethod.User("u1", List.of(b1));
        SummingMethod.User u2 = new SummingMethod.User("u2", List.of(b2, b3));
        SummingMethod.User u3 = new SummingMethod.User("u3", List.of(b4, b5, b6));
        Map<String, Integer> expect = Map.of(
                "u1", 1,
                "u2", 5,
                "u3", 15
        );
        assertEquals(expect, SummingMethod.summing(List.of(u1, u2, u3)));
    }
}