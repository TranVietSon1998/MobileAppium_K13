package labs.lab9;

import java.util.Random;

public class AnimalRace {
    public static void main(String[] args) {
        Animal eagle = new Animal.AnimalBuilder("Eagle").speed(new Random().nextInt(101)) // Random speed between 0 and 100
                .flyable(true).build();

        Animal falcon = new Animal.AnimalBuilder("Falcon").speed(new Random().nextInt(101)) // Random speed between 0 and 100
                .flyable(true).build();

        Animal tiger = new Animal.AnimalBuilder("Tiger").speed(new Random().nextInt(76)) // Random speed between 0 and 75
                .flyable(false).build();

        Animal snake = new Animal.AnimalBuilder("Snake").speed(new Random().nextInt(61)) // Random speed between 0 and 60
                .flyable(false).build();

        System.out.println("Eagle speed: " + eagle.getSpeed() + " km/h, Flyable: " + eagle.isFlyable());
        System.out.println("Falcon speed: " + falcon.getSpeed() + " km/h, Flyable: " + falcon.isFlyable());
        System.out.println("Tiger speed: " + tiger.getSpeed() + " km/h, Flyable: " + tiger.isFlyable());
        System.out.println("Snake speed: " + snake.getSpeed() + " km/h, Flyable: " + snake.isFlyable());

        determineRaceWinner(eagle, falcon, tiger, snake);
    }

    public static void determineRaceWinner(Animal... animals) {
        Animal winner = null;
        int maxSpeed = -1;

        for (Animal animal : animals) {
            if (animal.getSpeed() > maxSpeed) {
                maxSpeed = animal.getSpeed();
                winner = animal;
            }
        }

        System.out.println("Winner is " + winner + ", with speed: " + maxSpeed + " km/h");
    }
}
