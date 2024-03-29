package org.example;

import org.lab5.MergeSort;
import org.lab5.MergeSortBottomUp;
import org.lab6.QuickSort;
import org.lab7.RadixSort;
import org.lab8.BinaryHeap;
import java.util.Random;
import org.lab9.*;

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

        // Week 8

            BinaryHeap<Integer> heap = new BinaryHeap<Integer>();

            heap.insert(4);
            heap.insert(10);
            heap.insert(-5);
            heap.insert(7);

            System.out.println("current max: " + heap.delMax());
            System.out.println("current max: " + heap.delMax());
            System.out.println("current max: " + heap.delMax());
            System.out.println("heap size: " + heap.size());
            System.out.println("current max: " + heap.delMax()); */
        /* Create a BST with string keys, and integer values */

            // Week 9
            BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();

            bst.put("S", 1);
            bst.put("E", 2);
            bst.put("X", 3);
            bst.put("A", 4);
            bst.put("R", 5);
            bst.put("C", 6);
            bst.put("H", 7);
            bst.put("M", 8);

            System.out.println("R: " + bst.get("R"));			// 5
            System.out.println("M: " + bst.get("M"));			// 8
            System.out.println("X: " + bst.get("X"));			// 3

            System.out.println("bst size: " + bst.size());		// 8

            System.out.println("min key: " + bst.findMin());	// A
            System.out.println("max key: " + bst.findMax());	// X

            System.out.println("rank of E: " + bst.rank("E"));	// 2
            System.out.println("rank of R: " + bst.rank("R"));	// 5

            bst.deleteMin();
            System.out.println("min key: " + bst.findMin());	// C

            bst.delete("H");
            bst.delete("M");
            System.out.println("M: " + bst.get("M"));			// null
            System.out.println("bst size: " + bst.size());		// 5

            bst.iterate();
        }


    }
