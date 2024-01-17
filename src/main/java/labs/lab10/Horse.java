package labs.lab10;

import java.util.Random;

public class Horse extends Animal {
    @Override
    public int speed() {
        // Horse speed: Up to 75 km/h
        return new Random().nextInt(76); // Random speed between 0 and 75
    }

    @Override
    public String getName() {
        return "Horse";
    }
}
