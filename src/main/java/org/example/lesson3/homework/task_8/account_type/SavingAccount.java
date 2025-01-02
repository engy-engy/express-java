package org.example.lesson3.homework.task_8.account_type;

import org.example.lesson3.homework.task_8.BankAccount;

public class SavingAccount extends BankAccount {

    public SavingAccount(long accountNumber) {
        super(accountNumber);
    }

    public SavingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        setBalance(this.getBalance() * 0.05);
    }

    @Override
    public String toString() {
        return String.format("SavingAccount: balance = %.2f", getBalance());
    }

}
