package ru.geekbrains.jca.lessons.l12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.equals(calcOneThread(), calcTwoThread()));
    }

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    static void formula(float[] a, int index) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (float) (a[i] * Math.sin(0.2f + (i + index) / 5) * Math.cos(0.2f + (i + index) / 5) * Math.cos(0.4f + (i + index) / 2));
        }
    }

    public static float[] calcOneThread() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        formula(arr, 0);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
        return arr;
    }

    public static float[] calcTwoThread() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(() -> {
            formula(a1, 0);
        });
        Thread t2 = new Thread(() -> {
            formula(a2, h);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
        return arr;
    }
}
