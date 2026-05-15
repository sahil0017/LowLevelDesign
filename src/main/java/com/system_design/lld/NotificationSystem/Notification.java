package com.system_design.lld.NotificationSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Notification {
    protected final String recipient;
    protected final String timestamp;
    protected final String message;

    Notification(String recipient, String message) {
        this.recipient = recipient;
        this.timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.message = message;
    }

    protected String header(String timestamp, String recipient) {
        return "[" + timestamp + "]" + " to " + recipient;
    }

    public void send() {
        System.out.println(header(timestamp, recipient));
        System.out.println("Message: "+ message);
    }
}
