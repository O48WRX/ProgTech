package com.O48WRX.Dragon.StrategyPattern;

public class FireDragon extends Dragon{
    public FireDragon(String name) {
        setName(name);
        setDamageMult(new Easy());
        setDamageType(new FireDamage());
    }
}
