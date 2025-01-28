    package org.example.lesson_3.homework.task_8.account_type;

    import org.example.lesson_3.homework.task_8.BankAccount;

    public class CheckingAccount extends BankAccount {

    public CheckingAccount(long accountNumber) {
        super(accountNumber);
    }

    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public String toString() {
        return String.format("CheckingAccount: balance = %.2f", getBalance());
    }

    }
