package org.example.lesson_6.homework.task_2;

public class ReverseLinkedList {

    public static Node reverse(Node head) {
        if (head == null) return null;

        Node prev = null;
        Node next;

        while (head != null) {
            next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n5 = new Node(5, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
            Node n1 = new Node(1, n2); // head

        printList(n1);
        printList(reverse(n1));
    }
}
