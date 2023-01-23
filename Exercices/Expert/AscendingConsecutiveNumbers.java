




/*
  Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.

  Examples
  ascending("232425") ➞ true
  // Consecutive numbers 23, 24, 25

  ascending("2324256") ➞ false
  // No matter how this string is divided, the numbers are not consecutive.

  ascending("444445") ➞ true
  // Consecutive numbers 444 and 445.
  Notes
  A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them. 
  
  23-January-2023
*/

import java.util.stream.IntStream;
public class Challenge {
  public static boolean ascending(String str) {
    for (int i = 1; i <= str.length()/2; i++) {
      String[] strs = str.split("(?<=\\G.{" + i + "})");
      if (isConsecutiveAsc(strs)) {
        return true;
      }
    }
    return false;
  }
	
  private static boolean isConsecutiveAsc(String[] strs) {
    int num = Integer.parseInt(strs[0]);
    return IntStream.range(1, strs.length)
      .allMatch(i -> strs[i].equals("" + (num + i)));
  }
}
