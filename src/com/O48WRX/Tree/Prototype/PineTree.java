package com.O48WRX.Tree.Prototype;

public class PineTree implements TreePrototype {
    private int position;
    private boolean watered;
    private int size;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isWatered() {
        return watered;
    }

    public void setWatered(boolean watered) {
        this.watered = watered;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PineTree(int position, boolean watered, int size) {
        this.position = position;
        this.watered = watered;
        this.size = size;
    }

    @Override
    public TreePrototype clone() {
        return new PineTree(this.position, this.watered, this.size);
    }

    @Override
    public void grow() {
        System.out.println("Pine tree grows!");
    }
}
