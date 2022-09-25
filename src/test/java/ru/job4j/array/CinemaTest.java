package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CinemaTest {

    @Test
    public void checkEmptyPlace() {
        char[][] places = {
                {'O', 'O', 'X'},
                {'O', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        int[] rsl = Cinema.checkEmptyPlace(places);
        int[] expected = new int[] {0, 0};
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void checkEmptyPlaceIsNotNull() {
        char[][] places = {
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'O', 'O', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'O'}
        };
        int[] rsl = Cinema.checkEmptyPlace(places);
        int[] expected = new int[] {2, 2};
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void checkEmptyPlaceIsNull() {
        char[][] places = {
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'X'}
        };
        int[] rsl = Cinema.checkEmptyPlace(places);
        int[] expected = new int[] {};
        assertThat(rsl).isEqualTo(expected);
    }
}