




/*
  Given a string s, return the longest palindromic substring in s.
  Example 1:
  Input: s = "babad"
  Output: "bab"
  Explanation: "aba" is also a valid answer.
  
  Example 2:
  Input: s = "cbbd"
  Output: "bb"
  Constraints:
  1 <= s.length <= 1000
  s consist of only digits and English letters. 
  
  29-January-2023
*/


class Solution {
  public String longestPalindrome(String s) {
    if (s == null || "".equals(s)) {
      return s;
    }
    int len = s.length();
    String ans = "";
    int max = 0;
    boolean[][] dp = new boolean[len][len];
    for (int j = 0; j < len; j++) {
      for (int i = 0; i <= j; i++) {
        boolean judge = s.charAt(i) == s.charAt(j);
        dp[i][j] = j - i > 2 ? dp[i + 1][j - 1] && judge : judge;
        if (dp[i][j] && j - i + 1 > max) {
          max = j - i + 1;
          ans = s.substring(i, j + 1);
        }
      }
    }
    return ans;
  }
}
