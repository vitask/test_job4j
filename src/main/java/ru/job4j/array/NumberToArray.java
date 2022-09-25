package ru.job4j.array;

public class NumberToArray {

    public static int[] resolve(int number) {
        String numbers = Integer.toString(number);
        int[] array = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            array[i] = numbers.charAt(numbers.length() - 1 - i) - '0';
        }
        return array;
    }
}
