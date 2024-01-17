package labs.lab7_2;

import java.util.Random;

public class Dog extends Animal {

    @Override
    public int speed() {
        // Dog speed: Up to 60 km/h
        return new Random().nextInt(61); // Random speed between 0 and 60
    }

    @Override
    public String getName() {
       return "Dog";
    }
}
