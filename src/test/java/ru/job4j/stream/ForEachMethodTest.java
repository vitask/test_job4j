package ru.job4j.stream;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForEachMethodTest {

    @Test
    public void test() {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        ForEachMethod.show(Stream.of(1, 2, 3));
        String nl = System.lineSeparator();
        String expect = "1" + nl + "2" + nl + "3" + nl;
        assertEquals(expect, buffer.toString());
    }
}