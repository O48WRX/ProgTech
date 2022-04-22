package com.O48WRX.Juice.Observer;

import java.util.ArrayList;

public class JuiceData implements Subject{

    ArrayList observers;

    private int numberOfJuiceSold;

    public JuiceData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i<observers.size(); ++i){
            Observer observer = (Observer) observers.get(i);
            observer.update(numberOfJuiceSold);
        }
    }

    public void setNumberOfJuiceSold(int numberOfJuiceSold) {
        this.numberOfJuiceSold = numberOfJuiceSold;
    }
}
