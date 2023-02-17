



/*
  17-February-2023
*/


package com.jmboulos.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        // Methods all returning [0, 1, 1, 2, 3, 5, ...] for n = [0, 1, 2, 3, 4, 5, ...]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibMemo(n));
        System.out.println(fibBotUp(n));
        System.out.println(fibOptimized(n));
        System.out.println(fibBinet(n));
        sc.close();
    }

    /**
     * This method finds the nth fibonacci number using memoization technique
     *
     * @param n The input n for which we have to determine the fibonacci number
     * Outputs the nth fibonacci number
     */
    public static int fibMemo(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        int f;

        if (n <= 1) {
            f = n;
        } else {
            f = fibMemo(n - 1) + fibMemo(n - 2);
            map.put(n, f);
        }
        return f;
    }

    /**
     * This method finds the nth fibonacci number using bottom up
     *
     * @param n The input n for which we have to determine the fibonacci number
     * Outputs the nth fibonacci number
     */
    public static int fibBotUp(int n) {
        Map<Integer, Integer> fib = new HashMap<>();

        for (int i = 0; i <= n; i++) {
            int f;
            if (i <= 1) {
                f = i;
            } else {
                f = fib.get(i - 1) + fib.get(i - 2);
            }
            fib.put(i, f);
        }

        return fib.get(n);
    }

    /**
     * This method finds the nth fibonacci number using bottom up
     *
     * @param n The input n for which we have to determine the fibonacci number
     * Outputs the nth fibonacci number
     * <p>
     * This is optimized version of Fibonacci Program. Without using Hashmap and
     * recursion. It saves both memory and time. Space Complexity will be O(1)
     * Time Complexity will be O(n)
     * <p>
     * Whereas , the above functions will take O(n) Space.
     * @author Shoaib Rayeen (https://github.com/shoaibrayeen)
     */
    public static int fibOptimized(int n) {
        if (n == 0) {
            return 0;
        }
        int prev = 0, res = 1, next;
        for (int i = 2; i <= n; i++) {
            next = prev + res;
            prev = res;
            res = next;
        }
        return res;
}
    
    /**
    * We have only defined the nth Fibonacci number in terms of the two before it. Now, we will look at Binet's formula to calculate the nth Fibonacci number in constant time.
    * The Fibonacci terms maintain a ratio called golden ratio denoted by Φ, the Greek character pronounced ‘phi'.
    * First, let's look at how the golden ratio is calculated: Φ = ( 1 + √5 )/2 = 1.6180339887...
    * Now, let's look at Binet's formula: Sn = Φⁿ–(– Φ⁻ⁿ)/√5
    * We first calculate the squareRootof5 and phi and store them in variables. Later, we apply Binet's formula to get the required term.
    * Time Complexity will be O(1)
    */
    
    public static int fibBinet(int n) {
        double squareRootOf5 = Math.sqrt(5);
        double phi = (1 + squareRootOf5)/2;
        int nthTerm = (int) ((Math.pow(phi, n) - Math.pow(-phi, -n))/squareRootOf5);
        return nthTerm;
    }
}
