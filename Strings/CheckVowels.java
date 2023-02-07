



/*
 Vowel Count is a system whereby character strings are placed in order based on the position of the characters in the conventional ordering of an alphabet. 
 
 Wikipedia: https://en.wikipedia.org/wiki/Alphabetical_order 
  
  07-February-2023
*/

package com.jmboulos.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckVowels {

    private static final Set<Character> VOWELS = new HashSet<>(
        Arrays.asList('a', 'e', 'i', 'o', 'u')
    );

    /**
     * Check if a string is has vowels or not
     *
     * @param input a string
     * @return {@code true} if given string has vowels, otherwise {@code false}
     */
    public static boolean hasVowels(String input) {
        if (input == null) {
            return false;
        }
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (VOWELS.contains(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
