package org.example.lesson_4.practice.task_10;

/**
 * Создать функцию, которая определяет, есть ли в связанном списке цикл.
 */
public class LinkedLists {

    // Функция для проверки, есть ли цикл в связанном списке
    public static boolean hasCycle(Node head) {
        if (head == null) {return false;}

        Node slow = head; // Медленный указатель
        Node fast = head; // Быстрый указатель

        // fast и fast.next не равны null (иначе цикл невозможен, список закончился).
        while (fast != null && fast.getNext() != null) {
            // Двигаем медленный указатель на один узел вперед
            slow = slow.getNext();
            // Двигаем быстрый указатель на два узла вперед
            fast = fast.getNext().getNext();
            // Если указатели встретились, есть цикл
            if (slow == fast) {return true;}
        }

        // Если дошли до конца списка, цикла нет
        return false;
    }

    public static void main(String[] args) {
        // Создаем связанный список
        Node head = new Node(1);
        head.setNext(new Node(2));
        head.getNext().setNext(new Node(3));
        head.getNext().getNext().setNext(new Node(4));
        head.getNext().getNext().getNext().setNext(head.getNext()); // Создаем цикл (ссылаемся на второй узел)

        // Проверяем, есть ли цикл
        System.out.println("Цикл найден: " + hasCycle(head)); // Ожидается true

        // Создаем новый список без цикла
        Node head2 = new Node(1);
        head2.setNext(new Node(2));
        head2.getNext().setNext(new Node(3));

        // Проверяем второй список
        System.out.println("Цикл найден: " + hasCycle(head2)); // Ожидается false
    }

}

