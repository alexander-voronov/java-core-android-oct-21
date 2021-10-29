package ru.geekbrains.jca.lessons.l3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        game();
        //int i = 3;

    }

    public static int random() {
        Random rand = new Random();
        int a = rand.nextInt(9) + 1;
        //System.out.println(a);
        return a;
    }

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        return s;
    }


    public static void endGame() {
        System.out.println("The end!");
        System.exit(0);
    }

    public static void game() {
        int i = 4;  // number of attempts
        int x = random();
        System.out.println("Enter a number from 1 to 9: ");

        for (int j = i-1; j >=0; j--) {
            comparisonMethod(x, scan());
            if (j == 0) {
                System.out.println("Looser! Do you want to repeat the game again? 1 - yes / 0 - no");
                int g = scan();
                if (g == 1) game();
                else endGame();
            }
        }

        /*for (int i = 2; i >= 0; i--)
            switch (i) {
                case 0:
                    System.out.println("Looser! Do you want to repeat the game again? 1 - yes / 0 - no");
                    int g = scan();
                    if (g == 1) game();
                    else endGame();
                case 1:
                    comparisonMethod(x, scan());
                case 2:
                    comparisonMethod(x, scan());
            }*/
    }

    public static void comparisonMethod(int a, int b) {
        if (a > b) {
            System.out.println("Entered number is less, try again");
        }
        if (a < b) {
            System.out.println("Entered number is larger, try again");
        }
        if (a == b) {
            System.out.println("Winner! Do you want to repeat the game again? 1 - yes / 0 - no");
            int g = scan();
            if (g == 1) game();
            else endGame();
        }
    }
}
