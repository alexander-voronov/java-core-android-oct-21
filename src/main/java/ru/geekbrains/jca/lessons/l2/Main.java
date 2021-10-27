package ru.geekbrains.jca.lessons.l2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //arrayReplacement1();
        //arrayFill();
        //arrayReplacement2();
        //arrayDiagonal();
        //arrayFindMinMax();

    }

    public static void arrayReplacement1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.println(arr[i]);
        }
    }

    public static void arrayFill() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
            System.out.println(arr[i]);
        }
    }

    public static void arrayReplacement2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void arrayDiagonal() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i == j) || (i + j == arr.length - 1) ? 1 : 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void arrayFindMinMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (arr[i + 1] < a) {
                System.out.println(a);
            }
            //System.out.println(a);
        }
    }
}
