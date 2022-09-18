package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class Task28Test {

    public String ln = System.lineSeparator();

    @Test
    public void when32Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(32);
        String expected = "5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(10);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when66Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(66);
        String expected = "12" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}