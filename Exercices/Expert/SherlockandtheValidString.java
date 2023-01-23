




/*
  Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just 1 character at 1 index in the string, and the remaining characters will occur the same number of times. Given a string str, determine if it is valid. If so, return "YES", otherwise return "NO".

  For example, If str = "abc", the string is valid because the frequencies of characters are all the same. If str = "abcc", the string is also valid, because we can remove 1 "c" and have one of each character remaining in the string. However, if str = "abccc", the string is not valid, because removing one character does not result in the same frequency of characters.

  Examples
  isValid("aabbcd") ➞ "NO"
  // We would need to remove two characters, both c and d  -> aabb or a and b -> abcd, to make it valid.
  // We are limited to removing only one character, so it is invalid.

  isValid("aabbccddeefghi") ➞ "NO"
  // Frequency counts for the letters are as follows:
  // {"a": 2, "b": 2, "c": 2, "d": 2, "e": 2, "f": 1, "g": 1, "h": 1, "i": 1}
  // There are two ways to make the valid string:
  // Remove 4 characters with a frequency of 1: {f, g, h, i}.
  // Remove 5 characters of frequency 2: {a, b, c, d, e}.
  // Neither of these is an option.

  isValid("abcdefghhgfedecba") ➞ "YES"
  // All characters occur twice except for e which occurs 3 times.
  // We can delete one instance of e to have a valid string. 
  
  23-January-2023
*/

import java.util.Map;
import java.util.stream.Collectors;

public class Challenge {
  public static String isValid(String str) {
    Map<Long, Long> list = str.chars().boxed()
      .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
      .values().stream()
			.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    Long[] keyset = list.keySet().toArray(new Long[0]);
    return list.size() == 1 || list.size() == 2 && keyset[1]-keyset[0] == 1 && list.get(keyset[1]) == 1 ? "YES" : "NO";
  }
}
