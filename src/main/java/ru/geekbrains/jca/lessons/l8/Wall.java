package ru.geekbrains.jca.lessons.l8;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.jump(this.height)) {
            System.out.println(participant.getClass().getSimpleName() + " covered the height " + height);
            return true;
        }
        System.out.println(participant.getClass().getSimpleName() + " did not cover the height " + height);
        return false;
    }
}
