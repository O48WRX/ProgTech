package com.O48WRX.Beer.Singleton;

public class Beer {
    private static Beer instance;

    private Beer() {}

    public static Beer getInstance() {
        if(instance == null)
            instance = new Beer();
        return instance;
    }
}
