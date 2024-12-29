package org.example.lesson3.homework.task_2;

/**
 * BankAccount, который будет представлять банковский счет.
 */
public class BankAccount {

    private String accountNumber;

    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String deposit(double value) {
        return String.format("Баланс пополнен на сумму %.2f $.%nОстаток: %.2f $", value, balance +=value);
    }

    public String withdraw(double value) {
        if (balance < value) return String.format("На балансе не достаточно средств.%nОстаток: %.2f $", balance);
        balance -= value;
        return  String.format("Снято: %.2f $%nОстаток: %.2f $", value,  balance);
    }

    public String getBalance() {
        return String.format("Текущий баланс: %.2f $", balance);
    }

}
