package com.O48WRX.Car.ObjectComposition;

public class CivilianCarEngine implements Engine{

    public CivilianCarEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    private int horsePower = 120;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void turnedOn() {
        System.out.println("The engine is turned on!");
    }

    @Override
    public void turnedOff() {
        System.out.println("The engine is turned off!");
    }
}
