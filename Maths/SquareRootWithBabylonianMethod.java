



/*
 * Get the value, return the square root 
  
  21-February-2023
*/


package com.jmboulos.maths;

public class SquareRootWithBabylonianMethod {

    public static float square_Root(float num) {
        float a = num;
        float b = 1;
        double e = 0.000001;
        while (a - b > e) {
            a = (a + b) / 2;
            b = num / a;
        }
        return a;
    }
}
