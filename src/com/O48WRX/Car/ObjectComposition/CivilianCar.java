package com.O48WRX.Car.ObjectComposition;

public class CivilianCar extends Car{
    public CivilianCar() {
        driver = new CivilianDriver();
        engine = new CivilianCarEngine(120);
    }
}
