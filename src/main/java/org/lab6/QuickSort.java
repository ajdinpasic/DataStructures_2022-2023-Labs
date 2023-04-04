package org.lab6;

import org.lab4.*;

import java.util.Random;

public class QuickSort extends AbstractSort{

    public static void sort(int[] elements) {
        // call shuffle and pass int[] as argument
        shuffle(elements);
        sort(elements, 0, elements.length - 1);
        // private sort (elements, low, high)
    }

    public static void shuffle (int[] elements) {
        Random random = new Random();
        for (int i = 0; i < elements.length; i++) {
            int randomIndex = i + random.nextInt(elements.length-i);
            swap(elements, i , randomIndex);
        }
        //iterate over array
        //for each item generate random position with Random object
        // call swap function (elements, i , random_new_position)
    }

    private static void sort(int[] elements, int low, int high) {
        if(high <= low) return;
       // call partition to return index of pivot
        // call sort recursively two times to paritition subarray into two parts
        int pivot = partition(elements, low, high);
        sort(elements, low, pivot - 1);
        sort(elements, pivot + 1 , high);

    }

    private static int partition(int[] elements, int low, int high) {
        int i = low;
        int j = high + 1;
        while(true) {
            while(greater(elements[++i],elements[low])) {
                if (i == high) {
                    break;
                }
            }
            while(greater(elements[low],elements[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(elements,i, j);
        }
        swap(elements,low,j);

        return j;
    }



}
