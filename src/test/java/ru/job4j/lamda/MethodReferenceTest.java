package ru.job4j.lamda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MethodReferenceTest {

    @Test
    public void whenByClass() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        MethodReference.applyByClass();
        Assertions.assertEquals("From class: Hello", buffer.toString());
        System.setOut(before);
    }

    @Test
    public void whenByInstance() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        new MethodReference().applyByInstance();
        Assertions.assertEquals("From instance: Hello", buffer.toString());
        System.setOut(before);
    }

}