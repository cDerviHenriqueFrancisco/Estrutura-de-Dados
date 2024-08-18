public public class Node {
    int data;
    Node next;
    Node prev;

    
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}Main{

}

public class CircularDoublyLinkedList {
    private Node head;
    private Node tail;
    private Node sentinel;

    public CircularDoublyLinkedList() {
        sentinel = new Node(Integer.MIN_VALUE);
        head = sentinel;
        tail = sentinel;
        head.next = head;
        head.prev = head;
    }

    public void insertOrdered(int value) {
        Node newNode = new Node(value);
        Node current = head.next;

        while (current != head && current.data < value) {
            current = current.next;
        }

        newNode.prev = current.prev;
        newNode.next = current;

        current.prev.next = newNode;
        current.prev = newNode;

        if (current == head) {
            head = newNode;
        }
        if (newNode.next == head) {
            tail = newNode;
        }
    }

    public void printAscending() {
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void printDescending() {
        Node current = tail;
        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != tail);
        System.out.println();
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000];
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(19999) - 9999;
        }

        for (int number : numbers) {
            list.insertOrdered(number);
        }

        System.out.println("Lista em ordem crescente:");
        list.printAscending();

        System.out.println("Lista em ordem decrescente:");
        list.printDescending();
    }
}
