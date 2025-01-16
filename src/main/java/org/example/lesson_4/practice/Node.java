package org.example.lesson_4.practice;

public class Node {

    private String value;
    private Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void printNode() {
        System.out.printf("Current node: %s\n", value);
        if (next != null) {
            System.out.printf("Next node: %s\n", next.value);
        } else {
            System.out.println("No next node.");
        }
    }

    public static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {

        Node node = new Node("node1", null);
        Node node2 = new Node("node2", node);
        Node node3 = new Node("node3", node2);

        System.out.println("Original list:");
        node3.printNode();
        node2.printNode();
        node.printNode();

        System.out.println("\nReversed list:");
        Node reversedHead = reverseList(node3);

        while (reversedHead != null) {
            reversedHead.printNode();
            reversedHead = reversedHead.getNext();
        }
    }
}
