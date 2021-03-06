package ru.geekbrains.jca.lessons.l13;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {

    private static AtomicInteger ai;
    private static int CARS_COUNT;

    static {
        CARS_COUNT = 0;
        ai = new AtomicInteger(0);
    }

    private Race race;
    private int speed;
    private String name;
    CyclicBarrier barrier;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier barrier) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Participant №" + CARS_COUNT;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " is preparing");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " is ready");
            barrier.await();
            barrier.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            if (ai.incrementAndGet() == 1) {
                System.out.println(name + " WIN !");
            }

            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
