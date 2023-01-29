




/*
  Given a string s, find the length of the longest 
  substring
  without repeating characters.

  Example 1:

  Input: s = "abcabcbb"
  Output: 3
  Explanation: The answer is "abc", with the length of 3.
  
  Example 2:
  Input: s = "bbbbb"
  Output: 1
  Explanation: The answer is "b", with the length of 1.
  
  Example 3:
  Input: s = "pwwkew"
  Output: 3
  Explanation: The answer is "wke", with the length of 3.
  Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

  Constraints:
  * 0 <= s.length <= 5 * 104
  * s consists of English letters, digits, symbols and spaces. 
  
  29-January-2023
*/


class Solution {
public int lengthOfLongestSubstring(String s) {
int longestSoFar = 0;
List countingList = new ArrayList<>();
  for (char c : s.toCharArray()) {
    if (countingList.contains(c)){
      int currentSize = countingList.size();
      if (currentSize > longestSoFar) {
        longestSoFar = currentSize;
      }
      removeBeforeChar(countingList, c);
    }
    countingList.add(c);
  }
  if (countingList.size() > longestSoFar){
    return countingList.size();
  }
  return longestSoFar;
}
  private void removeBeforeChar(List<Character> input, char target){
    Iterator<Character> it = input.iterator();
    while(it.hasNext()){
      char c = it.next();
      it.remove();
      if (c  == target){
        break;
      }
    }
  }
}
