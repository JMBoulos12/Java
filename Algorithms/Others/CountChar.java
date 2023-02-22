



/*
 * Count non space character in string 
  
  22-February-2023
*/


package com.jmboulos.others;

public class CountChar {

    public static int CountCharacters(String str) {
        return str.replaceAll("\\s", "").length();
    }
}
