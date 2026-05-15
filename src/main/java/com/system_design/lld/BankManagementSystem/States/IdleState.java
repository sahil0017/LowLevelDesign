package com.system_design.lld.BankManagementSystem.States;

import com.system_design.lld.BankManagementSystem.ATM;
import com.system_design.lld.BankManagementSystem.Entities.Card;
import com.system_design.lld.BankManagementSystem.Enum.OperationType;

public class IdleState implements ATMState {
    @Override
    public void insertCard(ATM atm, String cardNumber) {
        System.out.println("\nCard has been inserted.");
        Card card = atm.getBankService().authenticate(cardNumber);

        if (card == null) {
            ejectCard(atm);
        } else {
            atm.setCurrentCard(card);
            atm.setCardCurrentState(new HasCardState());
        }
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("Error: Please insert a card first.");
    }

    @Override
    public void selectOperation(ATM atm, OperationType operationType, int... args) {
        System.out.println("Error: Please insert a card first.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Error: Card not found.");
        atm.setCurrentCard(null);
    }
}
