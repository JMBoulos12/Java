




/*
  Given two strings, write a method that finds the longest common sub-sequence. 
  21-January-2023
*/

public String findLongestCommonSequence(String s1, String s2) {
  String result = "";
  for (int length = s1.length(); length > 0; length--) {
    int startIndex = 0;
    while (startIndex + length <= s1.length()) {
      String current = s1.substring(startIndex, startIndex + length);
      if (s2.contains(current)) {
        result = current;
        break;
      }
      startIndex++;
    }
    if (result.length() != 0) {
      break;
    }
  }
  return result;
}
