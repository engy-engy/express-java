package org.example.lesson_6.task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account corporate = new Account("1", "123", AccountType.CORPORATE, 1000);
        Account personal = new Account("2", "456", AccountType.PERSONAL, 500);

        BankApp bankApp = new BankApp(List.of(corporate, personal));

        bankApp.showBalance();
        bankApp.transferTo(personal,100);
        bankApp.switchActiveAccountTo(personal);
        bankApp.showBalance();
    }
}
