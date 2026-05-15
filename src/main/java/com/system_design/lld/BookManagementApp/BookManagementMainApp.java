package com.system_design.lld.BookManagementApp;

public class BookManagementMainApp {
    public static void main(String []args){
        BookManagementService book = new BookManagementService("The Pragmatic Programmer", "David Thomas", "978-0135957059");
        book.displayInfo();

        boolean success = book.borrowBook();
        System.out.println("Borrow successful: " + success);
        book.displayInfo();

        success = book.borrowBook();
        System.out.println("Borrow successful: " + success);

        book.returnBook();
        book.displayInfo();
    }
}
