package com.O48WRX.Birds.ProgramToAnInterface;

public class Sing implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("The bird sings!");
    }
}
