package com.O48WRX.Animal.Absfactory;

public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
