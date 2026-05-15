package com.system_design.lld.NotificationSystem;

class SMSNotification extends Notification {
    private final String phoneNumber;
    private static final int MAX_LENGTH = 160;

    public SMSNotification(String recipient, String message, String phoneNumber) {
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println(formatHeader(timestamp, recipient));
        System.out.println("Phone: " + phoneNumber);
        String smsBody = message.length() > MAX_LENGTH
                ? message.substring(0, MAX_LENGTH - 3) + "..."
                : message;
        System.out.println("SMS: " + smsBody);
        System.out.println("Status: SMS sent (" + smsBody.length() + "/" + MAX_LENGTH + " chars)");
    }

    private String formatHeader(String timestamp, String recipient) {
        return "[" + timestamp + "]" + " to " + recipient;
    }
}
