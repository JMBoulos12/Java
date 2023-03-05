



/*
  Reverse String using Recursion 
  
  08-February-2023
*/

package com.jmboulos.strings;

public class ReverseStringRecursive {
    /**
     * @param str string to be reversed
     * @return reversed string
     */
    public static String reverse(String str)
    {
        if(str.isEmpty()){
            return str;
        } else {
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
}
