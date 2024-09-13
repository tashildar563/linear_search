package org.designPattern.FactoryPattern;

public class AnimalFactory {
    public Animal getAnimal(String name){
        if(name==null){
            return null;
        }
        if(name.equals("DOG")){
            return new Dog();
        }
        if (name.equals("CAT")){
            return new Cat();
        }
        return null;
    }
}
