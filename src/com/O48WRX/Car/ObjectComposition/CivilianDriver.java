package com.O48WRX.Car.ObjectComposition;

public class CivilianDriver implements Driver{

    @Override
    public void leaveWheel() {
        System.out.println("The civilian leaves the wheel!");
    }

    @Override
    public void Drive() {
        System.out.println("The civilian drives!");
    }
}
