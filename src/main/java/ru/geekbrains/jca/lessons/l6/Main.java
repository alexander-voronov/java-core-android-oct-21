package ru.geekbrains.jca.lessons.l6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        round(10);
    }

    public static int obstacleRun() {
        Random rand = new Random();
        int a = rand.nextInt(600);
        return a;
    }

    public static int obstacleSwim() {
        Random rand = new Random();
        int a = rand.nextInt(15);
        return a;
    }

    public static void competition() {
        Cat cat = new Cat("Barboskin", 200, 0);
        Dog dog = new Dog("Bobik", 500, 10);

        int x = obstacleRun();

        if (cat.getRun() >= x) {
            System.out.printf("Cat run %d meters \n", x);
        }

        if (cat.getRun() < x) {
            System.out.println("Cat didn't overcome the running obstacle");
        }

        if (dog.getRun() >= x) {
            System.out.printf("Dog run %d meters \n", x);
        }

        if (dog.getRun() < x) {
            System.out.println("Dog didn't overcome the running obstacle");
        }

        int y = obstacleSwim();

        if (cat.getSwim() == y) {
            System.out.printf("Cat swim %d meters \n", y);
        }

        if (dog.getSwim() >= y) {
            System.out.printf("Dog swim %d meters \n", y);
        }

        if (dog.getSwim() < y) {
            System.out.println("Dog didn't overcome the swimming obstacle");
        }

    }

    public static void round(int a) {
        for (int i = 0; i < a; i++) {
            System.out.printf("Round № %d\n", i + 1);
            competition();

        }
    }
}
