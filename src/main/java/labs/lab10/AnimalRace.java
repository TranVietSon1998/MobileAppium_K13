package labs.lab10;

public class AnimalRace {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        int horseSpeed = horse.speed();
        int tigerSpeed = tiger.speed();
        int dogSpeed = dog.speed();

        String horseName = horse.getName();
        String tigerName = tiger.getName();
        String dogName = dog.getName();

        System.out.println("Horse speed: " + horseSpeed + " km/h");
        System.out.println("Tiger speed: " + tigerSpeed + " km/h");
        System.out.println("Dog speed: " + dogSpeed + " km/h");

        if (horseSpeed > tigerSpeed && horseSpeed > dogSpeed) {
            System.out.println("Winner is: " + horseName + ", with speed is: " + horseSpeed);
        } else if (tigerSpeed > horseSpeed && tigerSpeed > dogSpeed) {
            System.out.println("Winner is: " + tigerName + ", with speed is: " + tigerSpeed);
        } else if (dogSpeed > horseSpeed && dogSpeed > tigerSpeed) {
            System.out.println("Winner is: " + dogName + ", with speed is: " + dogSpeed);
        } else {
            System.out.println("No animal wins");
        }
    }

}
