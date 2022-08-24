package ru.job4j.lamda;

import java.util.function.Supplier;

public class MRSupplier {
        public static Supplier<String> supplier() {
            return String::new;
        }
}
