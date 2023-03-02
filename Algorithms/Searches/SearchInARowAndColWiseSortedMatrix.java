



/*
 * Search a key in row and column wise sorted matrix
 *
 * @param matrix matrix to be searched
 * @param value  Key being searched for 
  
  08-February-2023
*/

package com.jmboulos.searches;

import java.util.Arrays;

public class SearchInARowAndColWiseSortedMatrix {

    public int[] search(int[][] matrix, int value) {
        int n = matrix.length;
        // This variable iterates over rows
        int i = 0;
        // This variable iterates over columns
        int j = n - 1;
        int[] result = { -1, -1 };

        while (i < n && j >= 0) {
            if (matrix[i][j] == value) {
                result[0] = i;
                result[1] = j;
                return result;
            }
            if (value > matrix[i][j]) {
                i++;
            } else {
                j--;
            }

        }
        return result;
    }
}
