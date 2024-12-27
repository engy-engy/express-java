package org.example.lesson2.homework.constructors_oop_principles;

import java.util.HashSet;

/**
 * Создайте класс BankAccount, который описывает банковский счёт:
 * Поля:
 * accountNumber (номер счёта, String),
 * balance (баланс, double).
 * Конструктор для инициализации счёта.
 * Методы:
 * deposit(double amount) - увеличивает баланс.
 * withdraw(double amount) - уменьшает баланс (если средств достаточно).
 * getBalance() - возвращает текущий баланс.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

}
