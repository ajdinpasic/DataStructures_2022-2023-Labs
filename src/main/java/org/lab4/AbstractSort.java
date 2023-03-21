package org.lab4;

public abstract class AbstractSort {

    public static boolean less(int a, int b) {
        return a < b;
    }

    public static boolean greater(int a, int b) {
        return a > b;
    }

    public static void swap(int[] elements, int a, int b) {
        int temp = elements[a];
        elements[a] = elements[b];
        elements[b] = temp;
    }
}
