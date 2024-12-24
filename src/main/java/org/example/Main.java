package org.example;

import static java.lang.Double.sum;
import static org.example.lesson2.practice.Calculator.*;

public class Main {
    public static void main(String[] args) {
        // Инкапсуляция это сокрытие данных, модификатор private, ...
        // Переменная это область памяти данных определенного типа (ячейка в памяти, ссылка куда ссылается, какой тип значения, если инициализирована то в ней уже есть значение)
        // Что такое оператор присваивания "+" —> оператор служит для определения значения
        // ЧТо такое определение метода и из каких компонентов состоит (модификатор, возвращаемый тип данных, имя метода (кемел кейз, не начинается с цифры), В скобках аргументы, тело метода)
        // Что такое static и final (final (класс или переменная) -> наследоваться от класса нельзя, неизменяемый) (static (метод или поле класса)-> доступно везде).
        // Зачем static –≥ когда не храним состояние, а передаем информацию. (Есть класс генерации тестовых данных, там метод может быть static, без создания экземпляра класса можно вызвать метод)

//        dividedThree();
//        dividedEven(2);
//        System.out.println(Arrays.toString(sortArray(new int[] {3,4,5,8,1,7})));
//        System.out.println(factorial(5));

        double num1 = 10, num2 = 5;

        System.out.println("Сложение: " + sum(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));

    }
}