package ru.job4j.array;

public class EvenVsOdd {

    public static int whoWin(int[] player) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < player.length; i++) {
            if (i % 2 == 0) {
                odd += player[i];
            } else {
                even += player[i];
            }
        }

        int res = 0;
        if (odd > even) {
            res = 1;
        } else if (odd < even) {
            res = 2;
        }
        return res;
    }
}
