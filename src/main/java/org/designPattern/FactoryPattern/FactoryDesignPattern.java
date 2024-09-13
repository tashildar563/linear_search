package org.designPattern.FactoryPattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.getAnimal("DOG");
        dog.speak();
        Animal cat = animalFactory.getAnimal("CAT");
        cat.speak();
    }

}
