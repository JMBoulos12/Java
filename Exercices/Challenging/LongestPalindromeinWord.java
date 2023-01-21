




/*
  A palindrome is a word which reads the same backward or forward.
  'abcba' is a palindrome.
  Write a method that returns the longest palindrome substring of a given string. 
  
  21-January-2023
*/

public String findLongestPalindrome(String word) {
  String longestPalindrome = "";
  for (int i = 0; i < word.length(); i++) {
    String current = findLongestPalindromeInternal(word.substring(i, word.length()));
    if (longestPalindrome.length() < current.length()) {
      longestPalindrome = current;
    }
  }
  return longestPalindrome;
}
public String findLongestPalindromeInternal(String word) {
  String longestPalindrome;
  int index = word.length();
  while (index > 0 && !isPalindrome(word.substring(0, index))) {
    index--;
  }
  longestPalindrome = word.substring(0, index);
  return longestPalindrome;
}
public boolean isPalindrome(String word) {
  int i1 = 0;
  int i2 = word.length() - 1;
  while (i2 > i1) {
    if (word.charAt(i1) != word.charAt(i2)) {
      return false;
    }
    ++i1;
    --i2;
  }
  return true;
}
