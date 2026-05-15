package com.system_design.lld.NotificationSystem;

public class NotificationMainApp {
    static void main (String []args) {
        // Email Notification
        EmailNotification emailNotification = new EmailNotification(
                "kanungosahil123@gmail.com",
                "Hi. How are you ?",
                "Greetings !!! Sahil"
        );
        emailNotification.send();

        // SMS Notification
        SMSNotification smsNotification = new SMSNotification(
                "kanungosahil123@gmail.com",
                "SMS -  Hi Sahil, How are you ???",
                "7022299648"
        );
        smsNotification.send();

        // Push Notification
        PushNotification pushNotification = new PushNotification(
                "kanungosahil123@gmail.com",
                "Push Notification - hi sahil, how are you ?",
                "OnePlus Nord CE Lite",
                "78"
        );
        pushNotification.send();

    }
}
