package com.system_design.lld.BookManagementApp;

public class BookManagementService {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isAvailable;


    public BookManagementService(String title, String author, String isbn) {
        // Initialize fields. Book starts as available.
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public boolean borrowBook() {
        // Mark book as unavailable if currently available
        // Return true if successful, false if already borrowed
        if (this.isAvailable) {
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        // Mark book as available
        this.isAvailable = true;
    }

    public void displayInfo() {
        String status = isAvailable ? "Available" : "Borrowed";
        System.out.println(title + " by " + author + " (ISBN: " + isbn + ") - " + status);
    }
}
