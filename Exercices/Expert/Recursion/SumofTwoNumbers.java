




/*
  Recursion: Sum of Two Numbers (with a twist!)
  
  This is an "expert" challenge??!! Why is a sum of two numbers an "expert" challenge??!! 
  Well, the numbers can have 1000 digits or even beyond such count...

  So, what's the twist? You have to do the summation as if you're doing it manually on a piece of paper. 
  Thus, the conversion of the numeric string to numeric literal is basically disallowed.

  Examples  :
  sum("12132000", "12171979") ➞ "24303979"
  sum("4666", "544") ➞ "5210"
  sum("1521512512512512515", "898989898989988998899898") ➞ "898991420502501511412413"
  sum("5125515215521515", "125261616261626") ➞ "5250776831783141"
  sum("6666666666666666666666666666", "99999999999999999999999") ➞ "6666766666666666666666666665"
  sum("123456789123456789123456789", "987654321987654321987654329876543") ➞ "987654445444443445444443453333332"
  
  Notes :
  * Remember how to sum two numbers ON A PAPER, such is the process.
  * Your function must run in less than 10 seconds because Edabit has a time limit.
  * The use of Number classes such as BigInteger or BigDecimal is disallowed -- it will defeat the purpose and the level of difficulty associated to this challenge.
  * You are expected to solve this challenge recursively. 
  
  26-January-2023
*/


import java.util.stream.IntStream;

public class TwistedNumberSum {
  public static String sum(String a, String b, int... n) {
    if (n.length < 1) {
      String x = new String(new char[Math.abs(a.length()-b.length())]).replace("\0", "0");
      if (a.length() < b.length()) a = x.concat(a); else b = x.concat(b);
    }
    if (a.length() == 0) return IntStream.of(n).mapToObj(String::valueOf).reduce("", String::concat);
    int i = a.length()-1, c = n.length > 0 && n[0] > 9 ? 1 : 0;
    if (c == 1) n[0] = Math.floorMod(n[0], 10);
    int t = Integer.parseInt(""+a.charAt(i)) + c + Integer.parseInt(""+b.charAt(i));
    return sum(a.substring(0, i), b.substring(0, i), IntStream.concat(IntStream.of(t), IntStream.of(n)).toArray());
  }
}
