package ru.geekbrains.jca.lessons.l8;

public class Cat implements Participant {
    private int run;
    private int jump;

    public Cat(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public boolean run(int length) {
        return this.run >= length;
    }

    @Override
    public boolean jump(int height) {
        return this.jump >= height;
    }
}
