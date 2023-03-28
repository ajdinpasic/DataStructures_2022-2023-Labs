package org.lab5;

import org.lab4.AbstractSort;
public class MergeSort extends AbstractSort{

    public static void sort(int[] elements) {
        int[] aux = new int[elements.length];
        sort(elements,aux, 0,elements.length-1);
    }

    private static void sort(int[] elements, int[] aux, int low, int high) {
        if(high <= low) return;

        int mid = low + (high - low) / 2; // middle point
        sort(elements, aux, low , mid); // left subarray
        sort(elements, aux, mid+1, high); // right subarray
        merge(elements, aux, low, mid, high); // compare elements, swap them, merge them
    }

    // Business logic
    public static void merge(int[] elements, int[] aux, int low, int mid, int high) {
        for (int k = low; k <= high; k++) {
            aux[k] = elements[k];
        }

        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high ; k++) {
            if ( i > mid) {
                elements[k] = aux[j++];
            }
            else if(j > high) {
                elements[k] = aux[i++];
            }
            else if (less(aux[j],aux[i])) {
                elements[k] = aux[j++];
            }
            else {
                elements[k] = aux[i++];
            }
        }
    }
}
