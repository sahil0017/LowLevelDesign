package com.system_design.lld.BankManagementSystem;

import com.system_design.lld.BankManagementSystem.DispenserChain.*;
import com.system_design.lld.BankManagementSystem.Entities.Card;
import com.system_design.lld.BankManagementSystem.Enum.OperationType;
import com.system_design.lld.BankManagementSystem.Services.BankService;
import com.system_design.lld.BankManagementSystem.States.ATMState;
import com.system_design.lld.BankManagementSystem.States.IdleState;

import java.util.concurrent.atomic.AtomicLong;

public class ATM {
    private static ATM INSTANCE;
    private final BankService bankService;
    private final CashDispenser cashDispenser;
    private static final AtomicLong transactionCounter = new AtomicLong(0);
    private ATMState currentState;
    private Card currentCard;

    ATM() {
        this.currentState = new IdleState();
        this.bankService = new BankService();


        DispenseChain c1 = new NoteDispenser100(10);
        DispenseChain c2 = new NoteDispenser50(20);
        DispenseChain c3 = new NoteDispenser20(30);
        c1.setNextDispense(c2);
        c2.setNextDispense(c3);

        this.cashDispenser = new CashDispenser(c1);
    }

    public static ATM getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ATM();
        }
        return INSTANCE;
    }

    public void setCardCurrentState(ATMState atmState) {
        this.currentState = atmState;
    }

    public void setCurrentCard(Card card) {
        this.currentCard = card;
    }

    public void insertCard(String cardNumber) {
        currentState.insertCard(this, cardNumber);
    }

    public void enterPin(String pin) {
        currentState.enterPin(this, pin);
    }

    public void setOperation(OperationType op, int ...args) {
        currentState.selectOperation(this, op, args);
    }

    public void checkBalance() {
        double balance = bankService.getBalance(currentCard);
        System.out.printf("Your current account balance is: $%.2f%n", balance);
    }

    public void withdrawBalance(int amount) {
        if (!cashDispenser.canDispenseCash(amount)) {
            throw new IllegalStateException("Insufficient cash available in the ATM.");
        }
        bankService.withdraw(currentCard, amount);

        try {
            cashDispenser.dispenseCash(amount);
        } catch (Exception e) {
            bankService.depositMoney(currentCard, amount);
        }
    }

    public void depositCash(int amount) {
        bankService.depositMoney(currentCard, amount);
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public BankService getBankService() {
        return bankService;
    }
}
