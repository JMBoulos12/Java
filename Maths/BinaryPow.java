



/*
 * Calculate a^p using binary exponentiation
 * [Binary-Exponentiation](https://cp-algorithms.com/algebra/binary-exp.html) 
  
  19-February-2023
*/


package com.jmboulos.maths;

public class BinaryPow {

    /**
     * @param a the base for exponentiation
     * @param p the exponent - must be greater than 0
     * @return a^p
     */
    public static int binPow(int a, int p) {
        int res = 1;
        while (p > 0) {
            if ((p & 1) == 1) {
                res = res * a;
            }
            a = a * a;
            p >>>= 1;
        }
        return res;
    }
}
