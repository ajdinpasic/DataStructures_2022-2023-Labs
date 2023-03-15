package org.lab3;

public class BubbleSort {

    static boolean swapped = false;

    public static void sort(Comparable[] collection) {
        for (int i = 0; i < collection.length; i++) {
            for (int j = 1; j < collection.length - i; j++) {
                    if(collection[j-1].compareTo(collection[j])>0) swap(collection, j-1, j);
            }

            if(!swapped) {
                break;
            }
        }
    }

    public static void swap(Comparable[] collection, int a, int b) {
        Comparable temp = collection[a];
        collection[a] = collection[b];
        collection[b] = temp;
        swapped = true;
    }
}
