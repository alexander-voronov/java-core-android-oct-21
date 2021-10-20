package ru.geekbrains.jca.lessons.l1;

public class Main {
    public static void main(String[] args) {
        methodOne(1, 2, 3, 4);
        methodTwo(5, 6);
        methodTree(-2);
        methodFour(-5);
        methodFive("Andrey");
        methodSix(800);
    }

    public static float methodOne(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean methodTwo(int a, int b) {
        int c = a + b;
        if (c >= 10 || c <= 20) {
            return true;
        }
        return false;
    }

    public static void methodTree(int a) {
        if (a >= 0) {
            System.out.println("The number is positive ");
        }
        if (a < 0) {
            System.out.println("The number is negative");
        }
    }

    public static boolean methodFour(int a) {
        if (a >= 0) {
            return false;
        }
        return true;
    }

    public static void methodFive(String a) {
        System.out.println("Hello, " + a + "!");
    }

    public static void methodSix(int a) {
        if (a % 100 != 0 && a % 4 == 0 || a % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
