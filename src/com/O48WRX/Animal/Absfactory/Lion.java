package com.O48WRX.Animal.Absfactory;

public class Lion implements Animal{
    @Override
    public String getAnimal() {
        return "Lion";
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
}
