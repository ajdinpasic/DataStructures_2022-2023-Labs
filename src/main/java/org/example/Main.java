package org.example;

import org.lab5.MergeSort;
import org.lab5.MergeSortBottomUp;
import org.lab6.QuickSort;
import org.lab7.RadixSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Week 2
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

        // Week 3
        Student a = new Student("Ajdin", "IT", 5.55);
        Student b = new Student("Mirza", "IT", 65.55);
        System.out.println(a.compareTo(b)); */
/*
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


        // Week 4
        int[] elements = new int[100];
        Random random = new Random();

        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(1000);
        }

        ShellSort.sort(elements);
        long start = System.currentTimeMillis();
        for (int item : elements) {
            System.out.println(item);
        }

        System.out.println(System.currentTimeMillis()-start);

    }
*/
            // Week 5
/*
            int[] elements = new int[100];
            Random random = new Random();

            for (int i = 0; i < elements.length; i++) {
                elements[i] = random.nextInt(1000);
            }

            //MergeSortBottomUp.sort(elements);
            MergeSort.sort(elements);

            for (int i: elements) {
                System.out.println(i);
            }

            // Week 6
        int[] elements = new int[100];
        Random random = new Random();

        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(1000);
        }

        QuickSort.sort(elements);

        for (int i: elements) {
            System.out.println(i);
        }
*/

        // Week 7
        int[] elements = new int[100];
        Random random = new Random();

        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(1000);
        }

        RadixSort.sort(elements);

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Element is: "+ elements[i]);
        }



    }


}
