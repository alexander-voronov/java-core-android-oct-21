package ru.geekbrains.jca.lessons.l7;

public class Main {
    public static void main(String[] args) {
        catsBowls();

    }

    private static void catsBowls() {
        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murzik", 100),
                new Cat("Vaska", 300),
        };
//        var bowl = new Bowl();
        Bowl bowl = new Bowl();
        bowl.putFood(500);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
