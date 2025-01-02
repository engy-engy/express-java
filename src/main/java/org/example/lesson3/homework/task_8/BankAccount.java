package org.example.lesson3.homework.task_8;

public abstract class BankAccount {

    private final long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit не может быть отрицательным");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else throw new IllegalArgumentException("На балансе не хватает денег");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}