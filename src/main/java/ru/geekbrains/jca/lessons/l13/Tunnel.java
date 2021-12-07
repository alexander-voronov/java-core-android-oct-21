package ru.geekbrains.jca.lessons.l13;

public class Tunnel extends Stage {
    public Tunnel() {
        this.length = 80;
        this.description = "Tunnel " + length + " meters";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " preparing for the stage (waiting): " + description);
                System.out.println(c.getName() + " started stage: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " finished stage: " + description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
