package com.system_design.lld.BankAccountApp;

public class BankAccount {
    private final String accountNumber;
    private final String ownerName;
    private double balance;
    private static final double THRESHOLD = 2000.00;


    BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }


    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("-ive amount cannot be deposit to balance");
            return ;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < THRESHOLD || amount < 0 || balance < amount) {
            System.out.println("Minimum amount should be in balance");
            return;
        }

        balance -= amount;
    }

    public void displayBankDetails() {
        System.out.println("\n Owner " + ownerName + "\n Account Number " + accountNumber + "\n Balance " + balance);
    }
}
