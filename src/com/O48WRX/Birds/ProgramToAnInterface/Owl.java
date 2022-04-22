package com.O48WRX.Birds.ProgramToAnInterface;

public class Owl extends Bird{
    public Owl() {
        soundBehavior = new Hoot();
    }

    @Override
    public void fly() {
        System.out.println("The Owl flies!");
    }

    @Override
    public void performSound() {
        super.performSound();
    }

    @Override
    public void setSoundBehavior(SoundBehavior sb) {
        super.setSoundBehavior(sb);
    }
}
