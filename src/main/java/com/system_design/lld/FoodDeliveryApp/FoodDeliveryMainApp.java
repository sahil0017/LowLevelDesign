package com.system_design.lld.FoodDeliveryApp;

public class FoodDeliveryMainApp {

    static void main (String []args) {
        // Food Order 1
        FoodOrder foodOrder1 = new FoodOrder("order#1", "Sahil Kanungo");
        foodOrder1.addItems("Butter Chicken", 150);
        foodOrder1.addItems("Chicken Mughlai", 180);
        foodOrder1.addItems("Chicken Hyderabadi", 210);
        foodOrder1.removeItem("Chicken Hyderabadi");
        foodOrder1.addItems("Chicken Biryani", 290);
        System.out.println("Is Order Placed Successfully ? " + foodOrder1.placeOrder());

        // Food Order 2
        FoodOrder foodOrder2 = new FoodOrder("order#2", "Nandita Bohidar");
        foodOrder2.addItems("Paneer Hyderabadi", 150);
        foodOrder2.addItems("Mushroom Chilli", 210);
        foodOrder2.addItems("Chicken Hyderabadi", 210);
        System.out.println("Is Order Placed Successfully ? " + foodOrder2.placeOrder());

        // once the order placed successfully, Do not add items
        foodOrder2.addItems("Pakhala", 80);
        System.out.println("Is Order Placed Successfully ? " + foodOrder2.placeOrder());

        // Display Order Status
        System.out.println("Food1 item size  " + foodOrder1.getItemCount());
        foodOrder1.displayOrder();
        System.out.println("Food2 item size  " + foodOrder2.getItemCount());
        foodOrder2.displayOrder();
    }
}
