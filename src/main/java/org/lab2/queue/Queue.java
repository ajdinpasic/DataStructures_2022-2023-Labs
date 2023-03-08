package org.lab2.queue;

public class Queue<Item>{

    private int size;
    private Node<Item> head;
    private Node<Item> tail;
    static String errorMsg = "Queue is empty";

    public boolean isEmpty() {
        return this.size == 0;
    }


    public int getSize() {
        return this.size;
    }


    public Item dequeue() {
        if(isEmpty()) throw new IndexOutOfBoundsException(errorMsg); // 1
        Item dataToBeRead = this.head.data;
        this.head = this.head.next;
        this.size--;
        if(isEmpty()) {
            this.tail = null;
        }
        return dataToBeRead;
    }


    public void enqueue(Item newNodeData) {
        Node<Item> newNode = new Node<Item>();
        newNode.data = newNodeData;
        if(this.isEmpty()) {
            this.head = newNode;
            //this.tail = newNode;
        } else {
            this.tail.next = newNode;
            //this.tail = newNode;
        }
        this.tail = newNode;
        this.size++;
    }
}
