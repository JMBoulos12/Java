




/*
  The function is given two strings s1 and s2. 
  Determine if one of the permutations of characters of s1 is a substring of s2, return true / false.

  Examples  :
  checkInclusion("ab", "edabitbooo") ➞ true
  // "ab" is in s2.

  checkInclusion("ab", "edaoboat") ➞ false
  // neither "ab" or "ba" is in s2.

  checkInclusion("adc", "dcda") ➞ true
  // "cda" is a permutation of "adc" and it is in s2.

  checkInclusion("sgyuws", "oldqwqdmlvsguswyfbj") ➞ true
  // "sguswy" is a permutation of s1 and it is in s2.
  Notes
  All characters in both strings are lowercase letters. 
  
  26-January-2023
*/

import java.util.stream.Stream;
import java.util.stream.Collectors;
public class ShuffledString {
  public static boolean checkInclusion(String ...s) {
    while (s[1].length() >= s[0].length()) {
      String[] t = Stream.of(s[0], s[1].substring(0, s[0].length()))
        .map(k -> k.chars().sorted().mapToObj(c -> (char) c + "")
             .collect(Collectors.joining(""))).toArray(String[]::new);
      if (t[0].equals(t[1])) return true;
      s[1] = s[1].substring(1); 
    }
    return false;
  }
}
