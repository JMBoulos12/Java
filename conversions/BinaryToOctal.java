



/*
  Converts any Binary number to an Octal Number 
  
  11-February-2023
*/


package com.jmboulos.conversions;

import java.util.Scanner;

public class BinaryToOctal {

    /**
     * Main method
     *
     * @param args Command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the binary number: ");
        int b = sc.nextInt();
        System.out.println("Octal equivalent: " + convertBinaryToOctal(b));
        sc.close();
    }

    /**
     * This method converts a binary number to an octal number.
     *
     * @param binary The binary number
     * @return The octal number
     */
    public static String convertBinaryToOctal(int binary) {
        String octal = "";
        int currBit = 0, j = 1;
        while (binary != 0) {
            int code3 = 0;
            for (int i = 0; i < 3; i++) {
                currBit = binary % 10;
                binary = binary / 10;
                code3 += currBit * j;
                j *= 2;
            }
            octal = code3 + octal;
            j = 1;
        }
        return octal;
    }
}
