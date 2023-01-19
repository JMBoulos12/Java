


/*
  Create a function that accepts a string, checks if it's a valid email address and returns either true or false, depending on the evaluation.

  The string must contain an @ character.
  The string must contain a . character.
  The @ must have at least one character in front of it.
  e.g. "e@edabit.com" is valid while "@edabit.com" is invalid.
  The . and the @ must be in the appropriate places.
  e.g. "hello.email@com" is invalid while "john.smith@email.com" is valid.
  If the string passes these tests, it's considered a valid email address.

  Examples
  validateEmail("@gmail.com") ➞ false

  validateEmail("hello.gmail@com") ➞ false

  validateEmail("gmail") ➞ false

  validateEmail("hello@gmail") ➞ false

  validateEmail("hello@edabit.com") ➞ true

  19-January-2023
*/

public class Program {
  public static boolean validateEmail(String s) {
    String[] a=s.split("@");
    if (a.length!=2 || a[0].equals("")) return false;
    if (a[1].split("\\.").length!=2) return false;
    return true;
  }
}
