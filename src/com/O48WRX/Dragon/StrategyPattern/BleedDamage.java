package com.O48WRX.Dragon.StrategyPattern;

public class BleedDamage implements DamageBehavior{

    Elemental element = Elemental.physical;

    @Override
    public void damageOverArmor() {
        System.out.println("Bleed penetrates armor!");
    }

    @Override
    public boolean blockable() {
        return true;
    }
}
