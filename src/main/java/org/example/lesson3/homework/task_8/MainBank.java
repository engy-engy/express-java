package org.example.lesson3.homework.task_8;

import org.example.lesson3.homework.task_8.account_type.CheckingAccount;
import org.example.lesson3.homework.task_8.account_type.SavingAccount;

import java.util.List;

public class MainBank {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(123L, 100);
        SavingAccount savingAccount = new SavingAccount(124L, 100);

        List<BankAccount> bankAccounts = List.of(checkingAccount, savingAccount);

        System.out.println("------------------");
        System.out.println(bankAccounts);
        for (BankAccount account : bankAccounts) {
            account.deposit(500);
            account.withdraw(200);
            account.calculateInterest();
        }
        System.out.println("------------------");
        System.out.println(bankAccounts);
        System.out.println("------------------");
    }
}