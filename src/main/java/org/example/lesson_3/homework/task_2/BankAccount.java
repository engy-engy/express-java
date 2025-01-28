package org.example.lesson_3.homework.task_2;

/**
 * BankAccount, который будет представлять банковский счет.
 */
public class BankAccount {

    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
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

    @Override
    public boolean equals(Object o){
        if(this == o) {return true;}
        if(null == o || getClass() != o.getClass()) return false;
        BankAccount bankAccount = (BankAccount) o;
        return this.accountNumber == bankAccount.accountNumber && this.balance == bankAccount.balance;
    }

    @Override
    public int hashCode() {
        return (int) (31 * accountNumber * balance);
    }

    @Override
    public String toString() {
        return String.format("BankAccount: accountNumber=%s | balance=%.2f", accountNumber, balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12345, 1000);
        System.out.println(bankAccount);
        bankAccount.deposit(500);
        System.out.println(bankAccount);
        bankAccount.withdraw(200);
        System.out.println(bankAccount);
    }

}
