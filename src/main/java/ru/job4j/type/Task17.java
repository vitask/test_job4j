package ru.job4j.type;

public class Task17 {

    public static void calculate(int base, int height) {
        double area = base * 0.5 * height;
        double perimeter = 2 * (base + height);
        System.out.printf("%.1f%n%.1f", area, perimeter);
    }
}
