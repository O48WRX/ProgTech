package com.O48WRX.Birds.ProgramToAnInterface;

public class Robin extends Bird{
    public Robin() {
        soundBehavior = new Sing();
    }

    @Override
    public void fly() {
        System.out.println("The robin flies!");
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
