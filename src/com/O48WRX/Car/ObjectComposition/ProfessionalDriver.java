package com.O48WRX.Car.ObjectComposition;

public class ProfessionalDriver implements Driver{

    @Override
    public void leaveWheel() {
        System.out.println("The professional driver leaves the wheel!");
    }

    @Override
    public void Drive() {
        System.out.println("The professional driver drives!");
    }
}
