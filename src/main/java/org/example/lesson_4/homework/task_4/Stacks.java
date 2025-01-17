package org.example.lesson_4.homework.task_4;

import java.util.Stack;

/**
 * функцию, использующую стек для проверки правильности последовательности скобок в строке
 * (например, "([]{})" является правильной, а "([)]" — нет).
 *
 * push(E item)	Добавляет элемент item в верхнюю часть стека.
 * pop()	Удаляет и возвращает верхний элемент стека.
 * peek()	Возвращает верхний элемент стека, не удаляя его.
 * empty()	Проверяет, пуст ли стек. Возвращает true, если стек пуст.
 * search(Object o)	Возвращает позицию элемента в стеке (от вершины, начинается с 1). Если элемент не найден, -1.
 */
public class Stacks {

//        Схема работы isValidSequence()
//        Строка: "([]{})"
//        Шаги:
//        1. Встретили '(': кладем в стек -> Стек: (
//        2. Встретили '[': кладем в стек -> Стек: ( [
//        3. Встретили '{': кладем в стек -> Стек: ( [ {
//        4. Встретили '}': извлекаем '{', проверяем пару -> OK -> Стек: ( [
//        5. Встретили ']': извлекаем '[', проверяем пару -> OK -> Стек: (
//        6. Встретили ')': извлекаем '(', проверяем пару -> OK -> Стек: пуст

    public static boolean isValidSequence(String s) {
        // Инициализация стека. Стек будет использоваться для хранения открывающих скобок.
        Stack<Character> stack = new Stack<>();

        // Цикл проходит по каждому символу строки
        for (char ch : s.toCharArray()) {
            // Если текущий символ одна из открывающихся скобок (, [, {, то добавить в стек
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Если символ с закрывающейся скобкой  ), ], }, то
            else if (ch == ')' || ch == ']' || ch == '}') {
                // Проверяется, пуст ли стек
                if (stack.isEmpty()) {
                    // Если стек пуст, то закрывающей скобке не предшествовала открывающая, и последовательность некорректна.
                    return false;
                }
                // Извлекаем верхний элемент стека
                char top = stack.pop();
                // Проверка, совпадают ли текущая закрывающая скобка и верхняя открывающая скобка
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        // Если стек не пуст, то остались несоответствующие открывающие скобки, и последовательность некорректна.
        return stack.isEmpty();
    }

    // Вспомогательная функция проверяет, является ли пара скобок (открывающая и закрывающая) совпадающей
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static boolean isValidSequence2(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                // Если текущий элемент = закрывающаяся скобка
                // И стек не пустой
                // И элемент на вершине стека открывающаяся скобка
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                // То удалить верхний элемент стека
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else { return false; } // Последовательность False
        }
        // Если все проверки (Удаление элементов по условию) прошли успешно, то последовательность True
        return true;
    }

    public static void main(String[] args) {
        String input1 = "([]{})"; // Правильная последовательность
        String input2 = "([)]";   // Неправильная последовательность
        String input3 = "({[()]})"; // Правильная последовательность
        String input4 = "((({{{[[[]]]}}})))"; // Правильная последовательность

        System.out.println(isValidSequence2(input1)); // true
        System.out.println(isValidSequence2(input2)); // false
        System.out.println(isValidSequence2(input3)); // true
        System.out.println(isValidSequence2(input4)); // true

    }
}
