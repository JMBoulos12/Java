




/*
  A palindrome is a series of letters or numbers that reads equivocally backwards.

  Write a recursive function that determines whether a given string is a palindrome or not.

  Examples  :
  isPalindrome("Maneuquenam") ➞ true
  isPalindrome("This phrase, surely, is not a palindrome!") ➞ false
  isPalindrome("Eva, can I see bees in a cave?") ➞ true 

  26-January-2023
*/

public class Phrase {
  public static boolean isPalindrome(String p) {
    p = p.replaceAll("[^a-zA-Z]","").toLowerCase();
    return isP(p,0);	
  }
  public static boolean isP(String p, int index) {
    if (index >= p.length()) return true;
	  if (p.charAt(index) != p.charAt(p.length()-index-1)) return false;
    return isP(p,index+1);
  }
}
