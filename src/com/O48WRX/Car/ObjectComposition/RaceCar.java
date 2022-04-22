package com.O48WRX.Car.ObjectComposition;

public class RaceCar extends Car{
    public RaceCar() {
        driver = new ProfessionalDriver();
        engine = new RaceCarEngine(750);
    }
}
