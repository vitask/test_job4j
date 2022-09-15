package ru.job4j.type;

public class Task24 {

    public static void separate(int number) {
        int num1, num2;
        num1 = number % 10;
        num2 = number - num1;
        System.out.println(num2 + "+" + num1);
    }
}
