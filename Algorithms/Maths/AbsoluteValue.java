



/*
 * Returns the absolute value of a number.
 *
 * @param number The number to be transformed
 * @return The absolute value of the {@code number} 
  
  19-February-2023
*/


package com.jmboulos.maths;

public class AbsoluteValue {

    public static int getAbsValue(int number) {
        return number < 0 ? -number : number;
    }
}
