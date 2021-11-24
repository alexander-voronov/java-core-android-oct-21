package ru.geekbrains.jca.lessons.l8;

public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.run(this.length)) {
            System.out.println(participant.getClass().getSimpleName() + " covered the distance " + length);
            return true;
        }
        System.out.println(participant.getClass().getSimpleName() + " did not cover the distance " + length);
        return false;
    }
}
