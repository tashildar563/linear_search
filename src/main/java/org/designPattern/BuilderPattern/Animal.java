package org.designPattern.BuilderPattern;

public class Animal {
    private final String breed;
    private final String sound;
    private final String colour;
    private final String age;
    private final boolean hasTail;

    //constructor to be called by the builder
    private Animal(AnimalBuilder animalBuilder) {
        this.breed = animalBuilder.breed;
        this.sound = animalBuilder.sound;
        this.age = animalBuilder.age;
        this.colour = animalBuilder.colour;
        this.hasTail = animalBuilder.hasTail;
    }

    //getters for the fields
    public String getBreed() {
        return breed;
    }


    public String getSound() {
        return sound;
    }


    public String getColour() {
        return colour;
    }


    public String getAge() {
        return age;
    }


    public boolean isHasTail() {
        return hasTail;
    }

    @Override
    public String toString() {
        return "Animal [Type=" + breed + ", Sound=" + sound + (colour != null ? ", Color=" + colour : "") + (", Age=" + age) + ", Has Tail=" + hasTail + "]";
    }

    //builder static inner class
    public static class AnimalBuilder {
        private String breed;
        private String sound;
        private String colour;
        private String age;
        private boolean hasTail;

        public AnimalBuilder(String breed, String sound) {
            this.breed = breed;
            this.sound = sound;
        }

        //setter methods for optional fields return builder object
        public AnimalBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public AnimalBuilder setSound(String sound) {
            this.sound = sound;
            return this;
        }

        public AnimalBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public AnimalBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public AnimalBuilder setHasTail(boolean hasTail) {
            this.hasTail = hasTail;
            return this;
        }

        // Build method to create the Animal object
        public Animal build() {
            return new Animal(this);
        }
    }
}
