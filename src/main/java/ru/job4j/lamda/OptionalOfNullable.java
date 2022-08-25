package ru.job4j.lamda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> res = Optional.empty();
        for (String s : strings) {
            if (Objects.equals(value, s)) {
                res = Optional.ofNullable(s);
            }
        }
        return res;
    }
}
