package com.system_design.lld.OrderProcessingApp;

public class OrderProcessingMainApp {
    static void main(String []args) {
        OrderProcessingService order = new OrderProcessingService("ORD-001", OrderProcessingService.PaymentMethod.CREDIT_CARD, 99.99);
        order.displayInfo();

        order.advanceStatus(); // PLACED -> CONFIRMED
        order.advanceStatus(); // CONFIRMED -> SHIPPED
        order.displayInfo();


        OrderProcessingService orderByDebitCard = new OrderProcessingService("ORD-002", OrderProcessingService.PaymentMethod.DEBIT_CARD, 199.99);
        orderByDebitCard.displayInfo();

        orderByDebitCard.advanceStatus(); // PLACED -> CONFIRMED
        orderByDebitCard.advanceStatus(); // CONFIRMED -> SHIPPED
        orderByDebitCard.displayInfo();

        System.out.println("Cancel after shipping: " + orderByDebitCard.cancelOrder());
    }
}
