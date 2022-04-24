package com.O48WRX.Weight.AdapterPattern;

public class WeighableAdapterImpl implements WeighableAdapter{
    private Weighable civilianCar;

    @Override
    public double getWeight() {
        return convertKGtoPound(civilianCar.getWeight());
    }

    public double convertKGtoPound(double kg) {
        return kg * 2.20462262;
    }
}
