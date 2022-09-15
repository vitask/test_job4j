package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class Task26Test {

    public String ln = System.lineSeparator();

    @Test
    public void when37Then81() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(37);
        String expected = "81" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when49Then102() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(49);
        String expected = "102" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(10);
        String expected = "9" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}