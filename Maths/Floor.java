



/*
 * Returns the largest (closest to positive infinity) 
  
  19-February-2023
*/


package com.jmboulos.maths;

import java.util.Random;

public class Floor {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 1000; ++i) {
            double randomNumber = random.nextDouble();
            assert floor(randomNumber) == Math.floor(randomNumber);
        }
    }
  
    public static double floor(double number) {
        if (number - (int) number == 0) {
            return number;
        } else if (number - (int) number > 0) {
            return (int) number;
        } else {
            return (int) number - 1;
        }
    }
}
