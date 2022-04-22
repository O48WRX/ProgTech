package com.O48WRX.Birds.ProgramToAnInterface;

public class Bird {
    public SoundBehavior soundBehavior;

    public void fly() {
        System.out.println("The bird flies!");
    }

    public void performSound() {
        soundBehavior.makeSound();
    }

    public void setSoundBehavior(SoundBehavior sb) {
        soundBehavior = sb;
    }
}
