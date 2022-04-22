package com.O48WRX.Dragon.StrategyPattern;

public class FireDamage implements DamageBehavior{

    Elemental element = Elemental.Fire;
    @Override
    public void damageOverArmor() {
        System.out.println("Fire damage penetrates armor!");
    }

    @Override
    public boolean blockable() {
        return false;
    }
}
