package com.O48WRX.Notification.Factory;

public class AndroidNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending android notification");
    }
}
