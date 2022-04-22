package com.O48WRX.Dragon.StrategyPattern;

public class Easy implements DifficultyBehavior{
    public Easy() {
        this.damage = 25;
        this.damageReceived = 50;
    }

    private int damage;
    private int damageReceived;

    public int getDamage() {
        return damage;
    }

    private void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void damage() {
        System.out.println("The monster deals 1x damage ("+damage+")!");
    }

    @Override
    public void receiveDamage() {
        System.out.println("The monster receives 1.5x damage ("+damageReceived+")!");
    }

    @Override
    public void block() {
        System.out.println("The monster blocks for the next turn!");
    }
}
