package org.example.lesson_4.homework.task_5;

public class Node {

    private String key;
    private int value;
    private Node next;
    private Node prev;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
