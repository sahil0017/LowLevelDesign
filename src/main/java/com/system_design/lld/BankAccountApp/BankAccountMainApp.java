package com.system_design.lld.BankAccountApp;

public class BankAccountMainApp {
    static void main(String []args) {
        BankAccount bankAccount1 = new BankAccount("4567890", "Sahil Kanungo");
        bankAccount1.deposit(1500);
        bankAccount1.deposit(200);
        bankAccount1.deposit(456);
        bankAccount1.withdraw(98);
        bankAccount1.withdraw(987);
        bankAccount1.withdraw(5678);
        bankAccount1.displayBankDetails();
        bankAccount1.deposit(678);
        bankAccount1.displayBankDetails();


        BankAccount bankAccount2 = new BankAccount("5656889", "Nandita Bohidar");
        bankAccount2.deposit(1900);
        bankAccount2.deposit(200);
        bankAccount2.deposit(9000);
        bankAccount2.withdraw(650);
        bankAccount2.withdraw(893);
        bankAccount2.withdraw(5237);
        bankAccount2.displayBankDetails();
        bankAccount2.deposit(-5237);
        bankAccount2.displayBankDetails();


    }
}
