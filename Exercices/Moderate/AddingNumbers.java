


/*
  Create a function that takes two number strings and returns their sum as a string.

  Examples  :
  add("111", "111") ➞ "222"

  add("10", "80") ➞ "90"

  add("", "20") ➞ "Invalid Operation"
  
  Notes :
  Return "Invalid Operation" If either input is "" or null.

  19-January-2023
*/

public class NumericString {
  public static String add(String a, String b) {
    try {
      return (Integer.parseInt(a)+Integer.parseInt(b))+"";
    } catch (Exception e) {
      return "Invalid Operation";
    }
  }
}
