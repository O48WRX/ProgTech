package com.O48WRX.ChristmasTree.Decorator;

public abstract class TreeDecorator implements ChristmasTree{
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
