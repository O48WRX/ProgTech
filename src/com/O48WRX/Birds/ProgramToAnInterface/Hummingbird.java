package com.O48WRX.Birds.ProgramToAnInterface;

public class Hummingbird extends Bird{
    public Hummingbird() {
        soundBehavior = new Hum();
    }

    @Override
    public void fly() {
        super.fly();
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
