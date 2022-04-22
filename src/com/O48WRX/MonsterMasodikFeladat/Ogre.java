package com.O48WRX.MonsterMasodikFeladat;

public class Ogre implements Monster{

    public Ogre(byte health, byte damage, byte blockAmountOfDamage) {
        this.health = health;
        this.damage = damage;
        this.blockAmountOfDamage = blockAmountOfDamage;
    }

    private byte health;
    private byte damage;
    private byte blockAmountOfDamage;
    private boolean dead = false;


    @Override
    public void receiveDamage(byte damage) {
        if(health <= 0){
            die();
        }
        System.out.println("The ogre received "+damage+" damage!");
        health -= damage;
    }

    @Override
    public void die() {
        this.dead = true;
        System.out.println("The ogre died!");
        // Then remove the monster...
    }

    @Override
    public void dealDamage() {
        System.out.println("The Ogre deals "+damage+" damage to the player!");
    }

    @Override
    public void block() {
        System.out.println("The Ogre blocks for the next turn!");
    }
}
