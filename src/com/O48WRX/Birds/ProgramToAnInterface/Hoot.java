package com.O48WRX.Birds.ProgramToAnInterface;

public class Hoot implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("The bird hoots!");
    }
}
