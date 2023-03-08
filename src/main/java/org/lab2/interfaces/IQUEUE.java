package org.lab2.interfaces;

public interface IQUEUE<Item> {

    boolean isEmpty();
    int getSize();
    Item dequeue();
    void enqueue(Item newNodeData);
    boolean test = false;

}
