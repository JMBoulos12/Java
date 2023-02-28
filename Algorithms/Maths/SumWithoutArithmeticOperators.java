



/*
  * Calculate the sum of two numbers a and b without using any arithmetic operators (+, -, *, /).
  * All the integers associated are unsigned 32-bit integers
  *https://stackoverflow.com/questions/365522/what-is-the-best-way-to-add-two-numbers-without-using-the-operator 
  
  21-February-2023
*/


package com.jmboulos.maths;

public class SumWithoutArithmeticOperators {

    public int getSum(int a, int b){
        if(b==0) return a;
        int sum = a^b;
        int carry = (a&b)<<1;
        return getSum(sum, carry);
    }
}
