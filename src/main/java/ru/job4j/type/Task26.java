package ru.job4j.type;

public class Task26 {

    public static void transform(int number) {
        int num1, num2;
        num1 = number % 10;
        num2 = number / 10;
        String rsl = (num1 + "" + num2);
        System.out.println(Integer.parseInt(rsl) + 8);
    }
}