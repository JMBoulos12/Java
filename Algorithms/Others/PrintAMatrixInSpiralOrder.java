



/*
 * Search a key in row and column wise sorted matrix 
  
  22-February-2023
*/


package com.jmboulos.others;

import java.util.ArrayList;
import java.util.List;

public class PrintAMatrixInSpiralOrder {

    public List<Integer> print(int[][] matrix, int row, int col) {

        // r traverses matrix row wise from first
        int r = 0;
        // c traverses matrix column wise from first
        int c = 0;
        int i;

        List<Integer> result = new ArrayList<>();

        while (r < row && c < col) {
            // print first row of matrix
            for (i = c; i < col; i++) {
                result.add(matrix[r][i]);
            }

            // increase r by one because first row printed
            r++;

            // print last column
            for (i = r; i < row; i++) {
                result.add(matrix[i][col - 1]);
            }

            // decrease col by one because last column has been printed
            col--;

            // print rows from last except printed elements
            if (r < row) {
                for (i = col - 1; i >= c; i--) {
                    result.add(matrix[row - 1][i]);
                }

                row--;

            }

            // print columns from first except printed elements
            if (c < col) {
                for (i = row - 1; i >= r; i--) {
                    result.add(matrix[i][c]);
                }
                c++;
            }

        }
        return result;
    }

}
