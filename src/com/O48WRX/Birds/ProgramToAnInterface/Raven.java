package com.O48WRX.Birds.ProgramToAnInterface;

public class Raven extends Bird{
    public Raven() {
        soundBehavior = new Caw();
    }

    @Override
    public void fly() {
        System.out.println("The raven flies!");
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
