package com.system_design.lld.BankManagementSystem.DispenserChain;

public interface DispenseChain {
    void setNextDispense(DispenseChain dispenseChain);

    void dispense(int amount);

    boolean canDispense(int amount);
}
