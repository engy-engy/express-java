package org.example.lesson1;

import java.util.HashMap;
import java.util.Map;

/**
 * Реализовать универсальный класс Cache, который может хранить элементы разных типов.
 * Класс должен поддерживать операции добавления элемента, получения элемента по ключу и удаления элемента по ключу.
 * Основные требования и подходы:
 * Класс Cache должен быть типизирован.
 * Используйте generics для типизации класса, так чтобы он мог работать с любым типом данных.
 * Хранение элементов.
 * Используйте HashMap для хранения элементов, где ключ и значение могут быть различных типов.
 * Методы для работы с кэшем:
 * public void put(K key, V value) - добавляет элемент в кэш.
 * public V get(K key) - возвращает элемент по ключу, если элемент не найден, возвращает null.
 * public void remove(K key) - удаляет элемент по указанному ключу.
 * @param <K, V>
 */
public class Cashe <K, V> {

    private Map <K, V> map;

    public Cashe() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void remove(K key) {
        map.remove(key);
    }

}
