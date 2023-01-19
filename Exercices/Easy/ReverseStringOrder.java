


/*
  Create a method that takes a string as its argument and returns the string in reversed order.

  Examples
  reverse("Hello World") ➞ "dlroW olleH"

  reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

  reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"
  Notes
  You can expect a valid string for all test cases.
  
  19-January-2023
*/

public class ReverseOrder {
  public static String reverse(final String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
