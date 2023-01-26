




/*
  Write a function that will return true if a given string (divided and grouped into a size) will contain a set of consecutive numbers (regardless of orientation: 
  whether ascending or descending), otherwise, return false.

  Examples  :
  
  isConsecutive("121314151617") ➞ true
  // Contains a set of consecutive ascending numbers
  // if grouped into 2's : 12, 13, 14, 15, 16, 17

  isConsecutive("123124125") ➞ true
  // Contains a set of consecutive ascending numbers
  // if grouped into 3's : 123, 124, 125

  isConsecutive("32332432536") ➞ false
  // Regardless of the grouping size, the numbers can't be consecutive.

  isConsecutive("326325324323") ➞ true
  // Contains a set of consecutive descending numbers
  // if grouped into 3's : 326, 325, 324, 323

  isConsecutive("667666") ➞ true
  // Consecutive descending numbers: 667 and 666.

  isConsecutive("999897959493") ➞ false
  
  IMPORTANT :
  The expected solution for this challenge is done recursively. Please check out the Resources tab for more details about recursion in Java.

  Notes :
  A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them. 
  
  26-January-2023
*/

import java.util.stream.*;

public class NumberSeries {
  public static boolean isConsecutive(String s, int... n) {
    int k = n.length < 1 ? 1 : n[0];
    if (k > s.length()/2) return false;
    long[] l = Stream.of(s.split("(?<=\\G.{" + k + "})")).mapToLong(Long::parseLong).toArray();
    return IntStream.range(1, l.length).allMatch(i -> l[i]-l[i-1] == 1) ||
      IntStream.range(1, l.length).allMatch(i -> l[i]-l[i-1] == -1) ? true :
    isConsecutive(s, ++k);
  }
}
