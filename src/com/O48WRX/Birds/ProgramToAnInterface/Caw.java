package com.O48WRX.Birds.ProgramToAnInterface;

public class Caw implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("The bird caws!");
    }
}
