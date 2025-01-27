package org.example.lesson_6.task_1;

import java.util.List;

public class BankApp {
    private List<Account> accounts;
    private Account activeAccount;

    public BankApp(List<Account> accounts) {
        if (accounts.isEmpty()) throw new IllegalStateException("No accounts available for bank application");

        this.accounts = accounts;
        this.activeAccount = accounts.get(0);
    }

    public void showBalance() {
        System.out.println(activeAccount.getBalance());
    }

    public void transferTo(Account account, int amount) {
        activeAccount.transferTo(account, amount);
    }

    public void switchActiveAccountTo(Account account) {
        if (activeAccount.getId().equals(account.getId())) throw new IllegalStateException("Account is not active");
        activeAccount = account;
    }
}
