package com.O48WRX.Animal.Absfactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String colorType) {
        if("White".equalsIgnoreCase(colorType))
            return new White();
        else if("Brown".equalsIgnoreCase(colorType))
            return new Brown();
        else if("Black".equalsIgnoreCase(colorType))
            return new Black();

        return null;
    }
}
