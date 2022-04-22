package com.O48WRX.Car.ObjectComposition;

public class Car {
    Driver driver;
    Engine engine;
    boolean canMove = false;
    boolean isDrived = false;

    public void performDrive() {
        driver.Drive();
        isDrived = true;
    }

    public void performLeaveWheel() {
        driver.leaveWheel();
        isDrived = false;
    }

    public void performEngineTurnedOn(){
        if(isDrived)
            engine.turnedOn();
            canMove = true;
    }

    public void performEngineTurnedOff() {
        if(isDrived)
            engine.turnedOff();
            canMove = false;
    }

    public void Move() {
        if(canMove && isDrived)
            System.out.println("The car moves!");
    }

    public void Park() {
        if(canMove && isDrived)
            System.out.println("The car is parked!");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
