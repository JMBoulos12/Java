




/*
  The function is given an array of characters. Recursively compress the array into a string using the following rules. 
  For each group of consecutively repeating characters:

  If the number of repeating characters is one, append the string with only this character.
  If the number n of repeating characters x is greater than one, append the string with "x" + n.
  
  Examples  :
  compress(["t", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "s", "s", "s", "h"]) ➞ "te14s3h"

  compress(["a", "a", "b", "b", "c", "c", "c"]) ➞ "a2b2c3"

  compress(["a"]) ➞ "a"

  compress(["a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b"]) ➞ "ab12"

  compress(["a", "a", "a", "b", "b", "a", "a"]) ➞ "a3b2a2" 
  
  26-January-2023
*/


import java.util.Arrays;
import java.util.stream.Stream;

public class CompressedChars {
  public static String compress(String[]... c) {
    if (c.length < 2) return compress(Arrays.copyOfRange(c[0], 1, c[0].length), new String[] {c[0][0]});
    if (c[0].length < 1) return Stream.of(c[1]).reduce("", (a, b) -> a+b.charAt(0)+(b.length() > 1 ? b.length()+"" : ""));
    if (c[1][c[1].length-1].contains(c[0][0])) { 
      while(c[0].length > 0 && c[1][c[1].length-1].contains(c[0][0])) {
        c[1][c[1].length-1] += c[0][0];
    		c[0] = Arrays.copyOfRange(c[0], 1, c[0].length); }
    } else {
      c[1] = Arrays.copyOf(c[1], c[1].length + 1);
    	c[1][c[1].length-1] = c[0][0];
    	c[0] = Arrays.copyOfRange(c[0], 1, c[0].length); }
    return compress(c[0], c[1]);
  }
}
