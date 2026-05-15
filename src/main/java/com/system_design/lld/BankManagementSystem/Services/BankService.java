package com.system_design.lld.BankManagementSystem.Services;

import com.system_design.lld.BankManagementSystem.Entities.Account;
import com.system_design.lld.BankManagementSystem.Entities.Card;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankService {
    private final Map<String, Account> accountMap = new ConcurrentHashMap<>();
    private final Map<String, Card> cardMap = new ConcurrentHashMap<>();
    private final Map<Card, Account> cardAccountMap = new ConcurrentHashMap<>();

    public BankService() {
        Account account1 = createAccount("1234567890", 1000.0);
        Card card1 = createCard("1234-5678-9012-3456", "1234");
        linkCardToAccount(card1, account1);

        Account account2 = createAccount("9876543210", 500.0);
        Card card2 = createCard("9876-5432-1098-7654", "4321");
        linkCardToAccount(card2, account2);
    }

    private Account createAccount(String accountNumber, double balance) {
        Account acc = new Account(accountNumber, balance);
        accountMap.put(accountNumber, acc);
        return acc;
    }

    public boolean authenticate(Card card, String pin) {
        return pin.equalsIgnoreCase(card.getPin());
    }

    public Card authenticate(String cardNumber) {
        return cardMap.getOrDefault(cardNumber, null);
    }

    public double getBalance(Card card) {
        return cardAccountMap.get(card).getBalance();
    }

    public void withdraw(Card card, double amount) {
        cardAccountMap.get(card).withdraw(amount);
    }

    public void depositMoney(Card card, double amount) {
        cardAccountMap.get(card).deposit(amount);
    }

    private Card createCard(String cardNumber, String pin) {
        Card card = new Card(cardNumber, pin);
        cardMap.put(cardNumber, card);
        return card;
    }

    private void linkCardToAccount(Card card, Account account) {
        account.getCards().put(account.getAccountNumber(), card);
        cardAccountMap.put(card, account);
    }
}
