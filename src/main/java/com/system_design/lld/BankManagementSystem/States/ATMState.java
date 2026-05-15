package com.system_design.lld.BankManagementSystem.States;

import com.system_design.lld.BankManagementSystem.ATM;
import com.system_design.lld.BankManagementSystem.Enum.OperationType;

public interface ATMState {
    void insertCard(ATM atm, String cardNumber);
    void enterPin(ATM atm, String pin);
    void selectOperation(ATM atm, OperationType operationType, int ... args);
    void ejectCard(ATM atm);
}
