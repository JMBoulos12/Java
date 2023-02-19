



/*
 * Find the minimum number of an array of numbers. 
  
  19-February-2023
*/


package com.jmboulos.maths;

import java.util.Arrays;
import java.util.Random;

public class FindMin {

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        Random random = new Random();

        /* random size */
        int size = random.nextInt(100) + 1;
        int[] array = new int[size];

        /* init array with random numbers */
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt() % 100;
        }

        assert Arrays.stream(array).min().getAsInt() == findMin(array);
    }
  
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
