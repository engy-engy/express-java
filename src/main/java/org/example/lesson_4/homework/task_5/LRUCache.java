package org.example.lesson_4.homework.task_5;

import java.util.HashMap;

public class LRUCache {

    private final HashMap<String, Node> cache; // Хранит ключи и соответствующие узлы двусвязного списка
    private final int capacity;
    private Node head; // Указатель на начало двусвязного списка
    private Node tail; // Указатель на конец двусвязного списка

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.capacity = capacity;
    }

    /**
     * Метод получения значения по ключу.
     * Если ключ есть в кеше, возвращает его значение и перемещает узел в начало списка (наиболее недавно использованный).
     * Если ключа нет, возвращает -1.
     */
    public int get(String key) {
        if (!cache.containsKey(key)) {return -1;}
        Node node = cache.get(key);
        // Перемещаем найденный узел в начало списка
        moveToHead(node);
        return node.getValue();
    }

    /**
     * Метод добавления нового элемента в кеш.
     * Если ключ уже есть, обновляет его значение и перемещает в начало.
     * Если ключа нет, добавляет новый узел. При переполнении удаляет элемент из хвоста (наименее недавно использованный).
     */
    public void put(String key, int value) {
        if (cache.containsKey(key)) {
            // Если ключ уже существует, обновляем значение и перемещаем узел в начало
            Node node = cache.get(key);
            node.setValue(value);
            moveToHead(node);
        } else {
            // Создаём новый узел и добавляем в кеш
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
        }
        // Если размер кеша превышает допустимый, удаляем элемент из хвоста
        if (cache.size() > capacity) {
            removeTail();
        }
    }

    /**
     * Перемещает узел в начало списка.
     * Используется, чтобы сделать элемент наиболее недавно использованным.
     */
    private void moveToHead(Node node) {
        removeNode(node);  // Удаляем узел из текущей позиции
        addToHead(node);   // Добавляем узел в начало
    }

    /**
     * Добавляет узел в начало двусвязного списка.
     * Делает его наиболее недавно использованным элементом.
     */
    private void addToHead(Node node) {
        node.setNext(head); // Текущий head становится следующим элементом нового узла
        node.setPrev(null); // У нового узла нет предыдущего элемента
        if (head != null) {
            head.setPrev(node); // Устанавливаем обратную связь с новым узлом
        }
        head = node; // Новый узел становится головой списка
        if (tail == null) {
            tail = node; // Если список пуст, новый узел становится и хвостом
        }
    }

    /**
     * Удаляет узел из хвоста списка.
     * Используется для удаления наименее недавно использованного элемента при переполнении кеша.
     */
    private void removeTail() {
        if (tail != null) {
            cache.remove(tail.getKey()); // Удаляем элемент из HashMap
            removeNode(tail); // Удаляем узел из списка
        }
    }

    /**
     * Удаляет узел из текущей позиции в двусвязном списке.
     * Перенастраивает связи предыдущего и следующего узлов.
     */
    private void removeNode(Node node) {
        if (node.getPrev() != null) {
            // Соединяем предыдущий узел с следующим
            node.getPrev().setNext(node.getNext());
        } else {
            // Если узел был головой, смещаем голову
            head = node.getNext();
        }
        if (node.getNext() != null) {
            // Соединяем следующий узел с предыдущим
            node.getNext().setPrev(node.getPrev());
        } else
            // Если узел был хвостом, смещаем хвост
            tail = node.getPrev();
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);

        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);

        System.out.println(cache.get("A")); // Вывод: 1
        cache.put("D", 4); // Удаляем "B" (наименее недавно использованный)

        System.out.println(cache.get("B")); // Вывод: -1 (удалён)
        cache.put("E", 5); // Удаляем "C"
        System.out.println(cache.get("C")); // Вывод: -1 (удалён)
        System.out.println(cache.get("A")); // Вывод: 1 (на месте)
    }
}
