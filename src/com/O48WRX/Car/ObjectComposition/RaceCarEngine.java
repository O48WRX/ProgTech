package com.O48WRX.Car.ObjectComposition;

public class RaceCarEngine implements Engine{
    int horsePower = 750;

    public RaceCarEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void turnedOn() {
        System.out.println("The racecar engine is turned on!");
    }

    @Override
    public void turnedOff() {
        System.out.println("The racecar engine is turned off!");
    }
}
