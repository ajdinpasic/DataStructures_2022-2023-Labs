package org.lab4;

public class ShellSort extends AbstractSort{

    public static void sort(int[] elements) {
        // h is stride
        int h = 1;
        while( h < elements.length / 3) {
            h = h*3 +1; //max
        }

        while (h>= 1) {
            for (int i = h; i < elements.length; i++) {
                for (int j = i; j >= h ; j -= h) {
                    if(less(elements[j],elements[j-h])) {
                        swap(elements,j,j-h);
                    }
                    else {
                        break;
                    }
                }
            }
            h = h / 3;
        }
    }
}
