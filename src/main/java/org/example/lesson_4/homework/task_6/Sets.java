package org.example.lesson_4.homework.task_6;

import java.util.HashSet;
import java.util.Set;

/**
 *  функция, которая принимает массив целых чисел и возвращает количество уникальных чисел в этом массиве.
 */
public class Sets {
//     Set коллекция, которая представляет неупорядоченное множество, в котором все элементы уникальны
//     Типы Set
//     HashSet - хеш-таблица, элементы не упорядочены, быстрый доступ к элементам. Время операции add/delete/search = О(1) (Если важна скорость)
//     LinkedHashSet - хеш-таблица, но сохраняет порядок добавления элементов. Используется когда важна уникальность и порядок добавления.
//     TreeSet - сбалансированное дерево (красно-черное). Элементы упорядочены по естественному порядку (если элементы сравнимы) или по компаратору. (Когда важна сортировка)

//    Основные методы:
//      1.	add(E e) — добавляет элемент в множество, если его там еще нет.
//    	2.	remove(Object o) — удаляет элемент из множества, если он есть.
//  	3.	contains(Object o) — проверяет, содержится ли элемент в множестве.
//	    4.	size() — возвращает количество элементов в множестве.
//    	5.	isEmpty() — проверяет, пусто ли множество.
//    	6.	clear() — удаляет все элементы из множества.
//    	7.	iterator() — возвращает итератор для перебора элементов множества.
//    	8.	addAll(Collection<? extends E> c) — добавляет все элементы из другой коллекции в текущее множество.
//    	9.	retainAll(Collection<?> c) — сохраняет только те элементы, которые есть в обеих коллекциях (пересечение).
//    	10.	removeAll(Collection<?> c) — удаляет все элементы, которые присутствуют в другой коллекции (разность).

    public static int uniqueElements(int[] array) {
        if (array == null || array.length == 0) {return 0;}

        Set<Integer> set = new HashSet<>();

        for (int el : array) {
            set.add(el);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,1,2,3,4,5};

        System.out.printf("Count unique: %d", uniqueElements(array));
    }
}
