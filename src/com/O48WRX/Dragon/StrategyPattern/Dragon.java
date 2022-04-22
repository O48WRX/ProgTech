package com.O48WRX.Dragon.StrategyPattern;

public class Dragon {
    private DamageBehavior damageType;
    private DifficultyBehavior damageMult;
    private String name;

    public DamageBehavior getDamageType() {
        return damageType;
    }

    public DifficultyBehavior getDamageMult() {
        return damageMult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void BreatheMagic() {
        System.out.println(name + " Breathes magic!");
    }

    public void Fly(){
        System.out.println(name +" flies!");
    }

    public void setDamageMult(DifficultyBehavior damageMult) {
        this.damageMult = damageMult;
    }

    public void setDamageType(DamageBehavior damageType) {
        this.damageType = damageType;
    }
}
