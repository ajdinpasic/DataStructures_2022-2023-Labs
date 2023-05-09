package org.lab7;

public class RadixSort {
    public static void sort(int[] elements) {
        int maxNumb = getMax(elements);

        for (int exponent = 1; maxNumb / exponent > 0 ; exponent*=10) {
            sort(elements,exponent);
        }
    }
    public static int getMax(int[] elements) {
        int max = elements[0];
        for(int x : elements) {
            if (x > max) max = x;
        }

        return max;
    }

    private static void sort(int[] elements, int exp) {
            int[] aux = new int[elements.length];
            int[] frequency = {0,0,0,0,0,0,0,0,0,0};

            for (int i = 0; i < elements.length; i++) {
                int digit = (elements[i] / exp) % 10;
                frequency[digit]++;
            }



            for (int i = 1; i < 10; i++) {
                frequency[i] += frequency[i-1];
            }

          for (int i = elements.length -1 ; i >= 0; i--) {
                int digit = (elements[i] / exp) % 10;
                aux[frequency[digit]-1] = elements[i];
                frequency[digit]--;
            }


           for (int i=0; i <elements.length; i++) {
                elements[i] = aux[i];
            }


    }

}
