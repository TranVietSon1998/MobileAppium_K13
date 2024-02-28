package labs.lab7_2;

import java.util.Random;

public  class Animal {
    private final String name;
    private final int maxSpeed;

    public Animal(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public int speed() {
        return new Random().nextInt(maxSpeed+1);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
