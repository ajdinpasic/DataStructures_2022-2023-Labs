package org.example;

import org.lab2.queue.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Queue<Integer > queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Size: "+queue.getSize());
        queue.enqueue(  13);
        System.out.println("Size: "+queue.getSize());
    }
}