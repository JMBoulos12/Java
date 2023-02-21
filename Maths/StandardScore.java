



/*
  21-February-2023
*/


package com.jmboulos.maths;

public class StandardScore {

    public static double zScore(double num, double mean, double stdDev) {
        double z = (num - mean) / stdDev;
        return z;
    }
}
