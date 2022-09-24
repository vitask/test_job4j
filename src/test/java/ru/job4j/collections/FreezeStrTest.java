package ru.job4j.collections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FreezeStrTest {

    @Test
    public void whenEq() {
        assertThat(FreezeStr.eq("Hello", "Hlloe")).isTrue();
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezeStr.eq("Hello", "Halle")).isFalse();
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr.eq("heloo", "hello")).isFalse();
    }
}