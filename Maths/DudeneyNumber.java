



/*
 * A number is said to be Dudeney if the sum of the digits, is the cube root of the entered number.
 * Example- Let the number be 512, its sum of digits is 5+1+2=8. The cube root of 512 is also 8.
 *          Since, the sum of the digits is equal to the cube root of the entered number;
 *          it is a Dudeney Number. 
  
  19-February-2023
*/


package com.jmboulos.maths;

import java.io.*;

public class DudeneyNumber {

    //returns True if the number is a Dudeney number and False if it is not a Dudeney number.
    public static boolean isDudeney(int n) {
        // Calculating Cube Root
        int cube_root = (int) (Math.round((Math.pow(n, 1.0 / 3.0))));
        // If the number is not a perfect cube the method returns false.
        if (cube_root * cube_root * cube_root != n) {
            return false;
        }
        int sum_of_digits = 0; // Stores the sums of the digit of the entered number
        int temp = n; //A temporary variable to store the entered number
        // Loop to calculate sum of the digits.
        while (temp > 0) {
            // Extracting Last digit of the number
            int rem = temp % 10;

            // Calculating sum of digits.
            sum_of_digits += rem;

            // Removing the last digit
            temp /= 10;
        }

        //If the cube root of the number is not equal to the sum of its digits we return false.
        return cube_root == sum_of_digits;
    }
}
