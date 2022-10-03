package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PositiveOrNegativeTest {

    @Test
    public void checkTrue() {
        int[] data = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative.check(data);
        assertThat(check).isTrue();
    }

    @Test
    public void checkFalse() {
        int[] data = {-6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative.check(data);
        assertThat(check).isFalse();
    }
}