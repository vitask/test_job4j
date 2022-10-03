package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {

        for (int cR = array[row].length - 1; cR > column; cR--) {
            array[row][cR] = array[row][cR - 1];
        }
        for (int cL = 0; cL < column; cL++) {
            array[row][cL] = array[row][cL + 1];
        }
        for (int rR = array.length - 1; rR > row; rR--) {
            array[rR][column] = array[rR - 1][column];
        }
        for (int rL = 0; rL < row; rL++) {
            array[rL][column] = array[rL + 1][column];
        }
        array[row][column] = 0;
    }
}
