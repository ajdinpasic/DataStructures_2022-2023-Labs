package org.example;

import org.lab2.queue.Queue;
import org.lab3.BubbleSort;
import org.lab3.Student;

public class Main {
    public static void main(String[] args) {
        // Week 1
    /*  System.out.println("Hello world!");
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

        // Week 2
        Student a = new Student("Ajdin", "IT", 65.55);
        Student b = new Student("Mirza", "IT", 65.55);
        System.out.println(a.compareTo(b)); */

        Student[] students = { new Student("Ajdin", "IT", 75.55),
                new Student("Zerina", "IT", 85.55),
                new Student("Mirza", "IT", 15.55),
                new Student("Tarik", "IT", 25.55),
                new Student("Nedim", "IT", 5.55)
        };

        BubbleSort.sort(students);

        for (Student student : students) {
            System.out.println(student.fullName + "\s" + student.department + "\s" + student.gpa);
        }

    }
}