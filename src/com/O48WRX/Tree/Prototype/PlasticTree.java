package com.O48WRX.Tree.Prototype;

public class PlasticTree implements TreePrototype{
    private int size;
    private int position;
    private boolean dusty;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isDusty() {
        return dusty;
    }

    public void setDusty(boolean dusty) {
        this.dusty = dusty;
    }

    public PlasticTree(int size, int position, boolean dusty) {
        this.size = size;
        this.position = position;
        this.dusty = dusty;
    }

    @Override
    public TreePrototype clone() {
        return new PlasticTree(this.size, this.position, this.dusty);
    }

    @Override
    public void grow() {
        System.out.println("Plastic tree can't grow.");
    }
}
