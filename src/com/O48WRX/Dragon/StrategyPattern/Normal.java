package com.O48WRX.Dragon.StrategyPattern;

public class Normal implements DifficultyBehavior{

    public Normal(int damage, int damageReceived) {
        this.damage = 37;
        this.damageReceived = 30;
    }

    private int damage;
    private int damageReceived;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamageReceived() {
        return damageReceived;
    }

    public void setDamageReceived(int damageReceived) {
        this.damageReceived = damageReceived;
    }

    @Override
    public void damage() {
        System.out.println("The monster deals 1.25x damage ("+damage+")!");
    }

    @Override
    public void receiveDamage() {
        System.out.println("The monster receives 1.25x damage ("+damageReceived+")!");
    }

    @Override
    public void block() {
        System.out.println("The monster blocks for the next turn!");
    }
}
