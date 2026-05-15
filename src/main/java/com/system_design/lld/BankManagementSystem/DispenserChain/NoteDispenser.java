package com.system_design.lld.BankManagementSystem.DispenserChain;

abstract class NoteDispenser implements DispenseChain {
    private DispenseChain nextDispenseChain;
    private final int noteValue;
    private int numNotes;

    NoteDispenser(int noteValue, int numNotes) {
        this.noteValue = noteValue;
        this.numNotes = numNotes;
    }

    @Override
    public void setNextDispense(DispenseChain nextDispenseChain) {
        this.nextDispenseChain = nextDispenseChain;
    }

    @Override
    public synchronized void dispense(int amount) {
        if (amount >= noteValue) {
            int numToDispense = Math.min(amount / noteValue, numNotes);
            int remainingAmount = amount - (numToDispense * noteValue);

            if (numToDispense > 0) {
                this.numNotes -= numToDispense;
            }

            if (remainingAmount > 0 && nextDispenseChain != null) {
                nextDispenseChain.dispense(remainingAmount);
            }
        } else if (nextDispenseChain != null) {
            nextDispenseChain.dispense(amount);
        }
    }

    @Override
    public boolean canDispense(int amount) {
        if (amount < 0) return false;
        if (amount == 0) return true;

        int numToDispense = Math.min(amount / noteValue, numNotes);
        int remainingAmount = amount - (numToDispense * noteValue);

        if (remainingAmount == 0) {
            return true;
        } else if (remainingAmount > 0 && nextDispenseChain != null) {
            return nextDispenseChain.canDispense(remainingAmount);
        }
        return false;
    }
}
