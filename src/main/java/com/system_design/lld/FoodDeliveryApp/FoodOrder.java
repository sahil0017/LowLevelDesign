package com.system_design.lld.FoodDeliveryApp;

import java.util.ArrayList;
import java.util.List;

/**
 * A food delivery app needs to manage orders.
 * Each order belongs to a customer, contains a list of food items with prices,
 * and tracks whether it has been placed. Customers build their order by adding items one at a time,
 * and once they're satisfied, they place the order. After that, no more items can be added
 */
public class FoodOrder {
    private final String orderId;
    private final String customerName;
    private final List<String> items;
    private double totalAmount;
    private boolean isPlaced;


    FoodOrder(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
        this.isPlaced = false;
    }

    // only add items if they are not placed
    public void addItems(String name, double price) {
        if (isPlaced) {
            System.out.println("Cannot modify order once placed");
            return;
        }

        items.add(name);
        totalAmount+=price;
    }

    public void removeItem(String name) {
        if (isPlaced) {
            System.out.println("Cannot modify order once placed");
            return;
        }

        items.remove(name);
    }

    public boolean placeOrder() {
        if (isPlaced || items.isEmpty()) {
            return false;
        }

        isPlaced =  true;
        return true;
    }

    public int getItemCount() {
        return items.size();
    }

    public void displayOrder() {
        String status = isPlaced ? "PLACED" : "PENDING";
        System.out.println("Order " + orderId + "( "+customerName+ " )" + status);

        for(String item: items) {
            System.out.println(" - " + item);
        }

        System.out.printf("Total $%.2f%n", totalAmount);
    }
}
