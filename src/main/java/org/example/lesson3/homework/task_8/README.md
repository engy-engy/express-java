Задача 8: Банковский счет и принципы ООП
Описание:
Создайте приложение для управления банковскими счетами, которое включает следующие классы:
Абстрактный класс BankAccount:
Поля: accountNumber (номер счета), balance (баланс).
Методы:
Абстрактный метод calculateInterest().
Реализация метода deposit(double amount) для пополнения счета.
Реализация метода withdraw(double amount) с проверкой на достаточность средств.
Класс SavingsAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest(), добавляя 5% годовых к балансу.
Класс CheckingAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest() без начисления процентов.
Инкапсуляция:
Поля accountNumber и balance должны быть приватными, с геттерами и сеттерами.
Полиморфизм:
Используйте массив объектов BankAccount, чтобы показать работу методов для разных типов счетов.