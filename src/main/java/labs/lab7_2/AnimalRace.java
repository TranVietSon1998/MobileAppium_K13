package labs.lab7_2;

public class AnimalRace {
    public static void main(String[] args) {
        Animal horse = new Animal("Horse", 75);
        Animal tiger = new Animal("Tiger", 100);
        Animal dog = new Animal("Dog", 60);
        determineRaceWinner(horse, tiger, dog);
    }

    public static void determineRaceWinner(Animal... animals) {
        Animal winner = null;
        int maxSpeed = -1;

        for (Animal animal : animals) {
            if (animal.speed() > maxSpeed) {
                maxSpeed = animal.speed();
                winner = animal;
            }
        }

        System.out.println("Winner is " + winner + ", with speed: " + maxSpeed + " km/h");
    }


}
