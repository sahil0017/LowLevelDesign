package com.system_design.lld.NotificationSystem;

import java.util.HashMap;

public class EmailNotification extends Notification {
    private final String subject;

    EmailNotification(String recipient, String message, String subject) {
        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println(formatHeader(timestamp, recipient));
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + message);
        System.out.println("Status: Email delivered");
    }

    public String formatHeader(String timestamp, String recipient) {
        return "[" + timestamp + "]" + " to " + recipient;
    }
}
