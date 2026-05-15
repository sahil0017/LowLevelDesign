package com.system_design.lld.OrderProcessingApp;

public class OrderProcessingService {
    private final String orderId;
    private final PaymentMethod paymentMethod;
    private OrderStatus orderStatus;
    private final double amount;

    OrderProcessingService(String orderId, PaymentMethod paymentMethod, double amount) {
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.orderStatus = OrderStatus.PLACED;
    }

    public boolean advanceStatus() {
        switch (orderStatus) {
            case PLACED -> {
                orderStatus = OrderStatus.CONFIRMED;
                return true;
            }
            case CONFIRMED -> {
                orderStatus = OrderStatus.SHIPPED;
                return true;
            }
            case SHIPPED -> {
                orderStatus = OrderStatus.DELIVERED;
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public boolean cancelOrder() {
        if (orderStatus == OrderStatus.PLACED || orderStatus == OrderStatus.CONFIRMED) {
            orderStatus = OrderStatus.CANCELLED;
            return true;
        }
        return false;
    }

    public double getTotalWithFees() {
        return amount + (amount * paymentMethod.getFeePercent() / 100);
    }

    public void displayInfo() {
        System.out.printf("Order %s | Status: %s | Payment: %s | Amount: $%.2f (with fees: $%.2f)%n",
                orderId, orderStatus, paymentMethod.getDisplayName(), amount, getTotalWithFees());
    }


    public enum PaymentMethod {
        CREDIT_CARD("Credit Card", 2.5),
        DEBIT_CARD("Debit Card", 1.0),
        UPI("UPI", 0.0),
        NET_BANKING("Net Banking", 1.5);

        private final String displayName;
        private final double feePercent;

        PaymentMethod(String displayName, double feePercent) {
            this.displayName = displayName;
            this.feePercent = feePercent;
        }

        public String getDisplayName() { return displayName; }
        public double getFeePercent() { return feePercent; }
    }
    /**
     * The key insight is that enums control the valid transitions: an order can only move forward through the status chain (PLACED to CONFIRMED to SHIPPED to DELIVERED), and cancellation is only allowed before shipping.
     */
    private enum OrderStatus {
        PLACED,
        CONFIRMED,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }
}
