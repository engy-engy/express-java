package org.example.lesson_4.homework.task_7;

import java.util.HashMap;
import java.util.Map;

/**
 * метод, который считает количество вхождений каждого символа в переданной строке и возвращает результат в виде карты (map).
 */
public class Maps {
//    Интерфейс из коллекций, который представляет собой структуру данных для хранения пар “ключ-значение”
//    Быстрый доступ по ключу и организация данных с быстрым поиском, добавлением и удалением.

//    HashMap - хеш-таблица. Произвольный порядок элементов, быстрый доступ к элементам get, put, remove
//    LinkedHashMap - основан на hashmap но сохраняет порядок добавления элементов. Менее производительный чем hashmap.
//    TreeMap - основан на кросно-черном дереве. Сортирует ключи по естественному порядку или по заданному компаратору.
//    Hashtable - схож с hashmap, но синхрониирован медленее. Устаревший.


    public static Map<String, Integer> countChars(String s) {
        if (s == null || s.isEmpty()) {return new HashMap<>();}

        Map<String, Integer> map = new HashMap<>();

        for (String k : s.split("")) {
            // map.getOrDefault(k, 0) проверяет, есть ли символ k в map
            // Если k существует, то возвращает его value
            // Если k нет, то возвращается value по умолчанию, defaultValue=0
            // map.put(k, ...) устанавливает новое value для k
            // Увеличивает value на 1 каждый раз, когда встречается этот же k
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        return map;
    }

    public static Map<Character, Integer> countChars2(String s) {
        if (s == null || s.isEmpty()) {return new HashMap<>();}

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
          if (map.containsKey(c)) {
              map.put(c, map.get(c) + 1);
          } else {
              map.put(c, 1);
          }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.printf("Map: %s\n", countChars("Helloworld"));
        System.out.printf("Map: %s\n", countChars2("Helloworld"));
    }
}
