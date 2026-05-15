package com.system_design.lld.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

/**
 * Build a ShoppingCart class that manages items, supports a one-time discount code, and prevents modifications after checkout.
 *
 * Requirements:
 *
 * Private map/dictionary of items (item name to price)
 * Private discount code (can only be applied once)
 * Private isCheckedOut flag
 * addItem(name, price): adds an item, but only if the cart hasn't been checked out
 * applyDiscount(code): if the code is "SAVE10" and no discount has been applied yet, marks the discount as applied and stores it. Returns success/failure.
 * getTotal(): returns the sum of all prices, minus 10% if a discount was applied
 * checkout(): marks the cart as checked out if it has at least one item. After checkout, no items can be added and no discounts can be applied.
 */
public class ShoppingCartService {
    private final Map<String, Double> items = new HashMap<>();
    private boolean isCheckedOut;
    private boolean isDiscount;

    public void addItem(String itemName, double price) {
        if (isCheckedOut) {
            System.out.println("Cannot modify a checked out item");
            return ;
        }

        items.put(itemName, price);
    }

    public boolean applyDiscount(String code) {
        if (code.equals("SAVE10") && !isDiscount && !isCheckedOut) {
            isDiscount = true;
            return true;
        }

        return false;
    }

    public double getTotal () {
        double sum = 0.0;
        for (double price : items.values()) {
            sum += price;
        }

        if (isDiscount) {
            sum *=0.9;
        }

        return Math.round(sum*100.0)/100.0;
    }

    public void checkout() {
        if (!isCheckedOut) {
            isCheckedOut = true;
        }
    }
}
