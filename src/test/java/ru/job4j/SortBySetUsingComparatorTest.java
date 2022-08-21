package ru.job4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class SortBySetUsingComparatorTest {

        @Test
        public void test() {
                List<String> input = Arrays.asList("1", "2", "3", "4", "5");
                Set<String> result = SortBySetUsingComparator.sort(input);
                Set<String> expect = new TreeSet<>(Set.of("5", "4", "3", "2", "1"));
                Assertions.assertEquals(expect, result);
        }
}