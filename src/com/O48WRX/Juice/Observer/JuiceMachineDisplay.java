package com.O48WRX.Juice.Observer;

public class JuiceMachineDisplay  implements Observer{
    private int sales;

    private Subject juiceSalesInformation;

    public JuiceMachineDisplay(Subject juiceSalesInformation){
        this.juiceSalesInformation = juiceSalesInformation;

        juiceSalesInformation.registerObserver(this);
    }

    @Override
    public void update(int juiceSold) {
        sales = juiceSold;
        display();
    }

    public void display(){
        System.out.println(sales + " juice sold.");
    }
}
