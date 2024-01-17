package labs.lab7_2;

import java.util.Random;

public class Tiger extends Animal {

    @Override
    public int speed() {
        // Tiger speed: Up to 100 km/h
        return new Random().nextInt(101); // Random speed between 0 and 100
    }

    @Override
    public String getName() {
        return "Tiger";
    }
}
