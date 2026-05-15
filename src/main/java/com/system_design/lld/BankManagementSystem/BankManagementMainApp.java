package com.system_design.lld.BankManagementSystem;

import com.system_design.lld.BankManagementSystem.Enum.OperationType;

public class BankManagementMainApp {
    static void main(String []args) {
        ATM atm = ATM.getInstance();
        atm.insertCard("1234-5678-9012-3456");
        atm.enterPin("1234");
        atm.setOperation(OperationType.CHECK_BALANCE);

        atm.insertCard("1234-5678-9012-3456");
        atm.enterPin("1234");
        atm.setOperation(OperationType.WITHDRAW_CASH, 70);

        atm.insertCard("1234-5678-9012-3456");
        atm.enterPin("1234");
        atm.setOperation(OperationType.CHECK_BALANCE);

        atm.insertCard("1234-5678-9012-3456");
        atm.enterPin("1234");
        atm.setOperation(OperationType.WITHDRAW_CASH, 700);

        atm.insertCard("1234-5678-9012-3456");
        atm.enterPin("1234");
        atm.setOperation(OperationType.DEPOSIT_CASH, 80);

        atm.insertCard("1234-5678-9012-3456");
        atm.enterPin("1234");
        atm.setOperation(OperationType.CHECK_BALANCE);
    }
}
