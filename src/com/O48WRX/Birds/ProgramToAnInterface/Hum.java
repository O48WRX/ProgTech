package com.O48WRX.Birds.ProgramToAnInterface;

public class Hum implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("The bird hums!");
    }
}
