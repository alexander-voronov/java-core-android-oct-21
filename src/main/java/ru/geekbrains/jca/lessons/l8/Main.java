package ru.geekbrains.jca.lessons.l8;

public class Main {
    public static void main(String[] args) {
        Participant[] participant = {
                new Human(3000, 2),
                new Cat(500, 5),
                new Robot(10000, 1)
        };
        Obstacle[] obstacles = {
                new Treadmill(450),
                new Wall(1),
                new Treadmill(2000),
                new Wall(3)
        };
        for (Participant a : participant) {
            for (Obstacle b : obstacles) {
                if (!b.overcome(a)) break;
            }

        }
    }
}
