
/*
  Write a method that reverses a string.
  For example, 'java interview' becomes 'weivretni avaj'.
  18-January-2023
*/

public String reverse(String s) {
  String result = "";
  for (int i = 0; i < s.length(); i++) {
    result += s.charAt(s.length() - i - 1);
  }
  return result;
}
