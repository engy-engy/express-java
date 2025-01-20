package org.example.lesson_4.homework.task_10;

/**
 * Создать функцию, которая определяет, есть ли в связанном списке цикл.
 */
public class LinkedLists {

    // Функция для проверки, есть ли цикл в связанном списке
    public static boolean hasCycle(Node head) {
        if (head == null) {return false;}

        Node slow = head; // Медленный указатель
        Node fast = head; // Быстрый указатель

//      fast и fast.next не равны null (иначе цикл невозможен, список закончился).
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Двигаем медленный указатель на один узел вперед
            fast = fast.next.next;      // Двигаем быстрый указатель на два узла вперед

            if (slow == fast) {         // Если указатели встретились, есть цикл
                return true;
            }
        }

        return false; // Если дошли до конца списка, цикла нет
    }

    public static void main(String[] args) {
        // Создаем связанный список
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Создаем цикл (ссылаемся на второй узел)

        // Проверяем, есть ли цикл
        System.out.println("Цикл найден: " + hasCycle(head)); // Ожидается true

        // Создаем новый список без цикла
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        // Проверяем второй список
        System.out.println("Цикл найден: " + hasCycle(head2)); // Ожидается false
    }

}

