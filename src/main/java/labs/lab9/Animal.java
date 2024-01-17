package labs.lab9;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    // private constructor to enforce the use of the builder
    Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return name;
    }

    // Builder class
    public static class AnimalBuilder {
        private final String name;
        private int speed;
        private boolean flyable;

        public AnimalBuilder(String name) {
            this.name = name;
        }

        public AnimalBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalBuilder flyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }


}
