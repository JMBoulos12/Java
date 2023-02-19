



/**
  * Returns the smallest (closest to negative infinity) 
  
  19-February-2023
*/


package com.jmboulos.maths;

public class Ceil {

    public static double ceil(double number) {
        if (number - (int) number == 0) {
            return number;
        } else if (number - (int) number > 0) {
            return (int) (number + 1);
        } else {
            return (int) number;
        }
    }
}
