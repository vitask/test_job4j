package ru.job4j;

import org.junit.jupiter.api.Test;
import ru.job4j.sort.NullLastMethod;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NullLastMethodTest {

    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullLastMethod.nullLast());
        assertEquals(Arrays.asList("1", "2", "3", null), list);
    }
}