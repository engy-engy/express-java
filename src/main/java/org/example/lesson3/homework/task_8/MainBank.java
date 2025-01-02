package org.example.lesson3.homework.task_8;

import org.example.lesson3.homework.task_8.account_type.CheckingAccount;
import org.example.lesson3.homework.task_8.account_type.SavingAccount;

import java.util.List;

public class MainBank {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(100100002001L, 1000);
        SavingAccount savingsAccount = new SavingAccount(100100002002L, 1000);

        List<BankAccount> accounts = List.of(checkingAccount, savingsAccount);

        System.out.println("Initial state:");
        System.out.println(accounts);
        for (BankAccount account : accounts) {
            account.deposit(500);
            account.withdraw(200);
            account.calculateInterest();
        }
        System.out.println("After a year:");
        System.out.println(accounts);
    }
}