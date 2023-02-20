



/*
  20-February-2023
*/


package com.jmboulos.maths;

public class ParseInteger {

    public static void main(String[] args) {
        assert parseInt("123") == Integer.parseInt("123");
        assert parseInt("-123") == Integer.parseInt("-123");
        assert parseInt("0123") == Integer.parseInt("0123");
        assert parseInt("+123") == Integer.parseInt("+123");
    }
  
    public static int parseInt(String s) {
        if (s == null || s.length() == 0) {
            throw new NumberFormatException("null");
        }
        boolean isNegative = s.charAt(0) == '-';
        boolean isPositive = s.charAt(0) == '+';
        int number = 0;
        for (
            int i = isNegative ? 1 : isPositive ? 1 : 0, length = s.length();
            i < length;
            ++i
        ) {
            if (!Character.isDigit(s.charAt(i))) {
                throw new NumberFormatException("s=" + s);
            }
            number = number * 10 + s.charAt(i) - '0';
        }
        return isNegative ? -number : number;
    }
}
