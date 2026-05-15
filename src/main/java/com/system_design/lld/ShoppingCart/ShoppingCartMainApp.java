package com.system_design.lld.ShoppingCart;

public class ShoppingCartMainApp {
    static void main(String []args) {
        ShoppingCartService shoppingCartService = new ShoppingCartService();

        shoppingCartService.addItem("Brush", 100);
        shoppingCartService.addItem("Chocolate", 40);
        shoppingCartService.addItem("Lays", 50);

        System.out.printf("Discount Applied %b\n",shoppingCartService.applyDiscount("SAVE10"));
        System.out.printf("Total - %.2f\n", shoppingCartService.getTotal());

        shoppingCartService.checkout();
        shoppingCartService.addItem("Shirt", 1200);
    }
}
