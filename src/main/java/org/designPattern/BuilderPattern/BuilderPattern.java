package org.designPattern.BuilderPattern;

public class BuilderPattern {
    public static void main(String[] args) {
        Animal dogOne = new Animal.AnimalBuilder("indian","wooof").build();
        Animal dogTwo = new Animal.AnimalBuilder("South indian","wooof").setAge("10").setColour("black").setHasTail(false).build();
        System.out.println(dogOne);
        System.out.println(dogTwo);
    }
}
