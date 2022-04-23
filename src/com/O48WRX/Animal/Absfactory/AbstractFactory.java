package com.O48WRX.Animal.Absfactory;

public interface AbstractFactory<T> {
    T create(String animalType);
}
