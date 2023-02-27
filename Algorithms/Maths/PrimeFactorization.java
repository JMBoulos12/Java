



/*
  20-February-2023
*/


package com.jmboulos.maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public static List<Integer> pfactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        if (n == 0) {
            return primeFactors;
        }

        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        if (n > 2) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}
