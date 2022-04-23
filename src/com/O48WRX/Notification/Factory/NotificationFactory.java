package com.O48WRX.Notification.Factory;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if(channel == null || channel.isEmpty()) {
            return null;
        }
        switch(channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            case "ANDROID":
                return new AndroidNotification();
            default:
                System.out.println("Unknown channel: "+channel);
                return null;
        }
    }
}
