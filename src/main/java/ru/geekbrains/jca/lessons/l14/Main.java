package ru.geekbrains.jca.lessons.l14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fourArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(checkArray(new int[]{1, 1, 4, 4}));
    }

    public static int[] fourArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) return Arrays.copyOfRange(arr, i + 1, arr.length);
        }
        throw new RuntimeException("Four not found!");
    }

    public static boolean checkArray(int[] arr) {
        boolean number1 = false;
        boolean number4 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) number1 = true;
            else if (arr[i] == 4) number4 = true;
            else return false;
        }
        return number1 && number4;
    }
}
