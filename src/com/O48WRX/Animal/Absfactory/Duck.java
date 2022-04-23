package com.O48WRX.Animal.Absfactory;

public class Duck implements Animal{
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Quack";
    }
}
