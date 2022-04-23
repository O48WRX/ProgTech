package com.O48WRX.Animal.Absfactory;

public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String animalType) {
        if("Dog".equalsIgnoreCase(animalType))
            return new Dog();
        else if("Duck".equalsIgnoreCase(animalType))
            return new Duck();
        else if("Lion".equalsIgnoreCase(animalType))
            return new Lion();

        return null;
    }
}
