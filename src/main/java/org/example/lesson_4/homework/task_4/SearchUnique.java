package org.example.lesson_4.homework.task_4;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Первый уникальный символ
 * Разработать метод, который возвращает первый уникальный символ в тексте.
 * Какую структуру данных использовать для оптимизации поиска?
 */
public class SearchUnique {

//    LinkedHashMap — это оптимальный выбор. Обоснование:
//    1. Сохранение порядка: LinkedHashMap сохраняет порядок добавления ключей, что важно для поиска первого уникального символа.
//	  2. Подсчёт частоты: Используя LinkedHashMap, легко подсчитать количество появлений каждого символа.
//	  3. Оптимальная сложность:
//        Вставка и поиск выполняются за амортизированное O(1).
//        Проверка первого уникального символа выполняется за O(n).

    public static Character searchUnique(String string) {
        if (string == null || string.isEmpty()) return null;

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Подсчитать количество вхождений каждого символа строки
        for (char ch : string.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        // Найти первый уникальный элемент
        // В классе Map, метод entrySet возвращает набор пар ключ-значение
        // Цикл проходит по каждому элементу карты map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Если текущий значение ключа == 1, то вернуть этот key
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(searchUnique("swiss"));
    }
}