



/*
  Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
  Return the answer in any order.

  A mapping of digits to letters (just like on the telephone buttons) is given below. 
  Note that 1 does not map to any letters.

  Example 1:
  Input: digits = "23"
  Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
  
  Example 2:
  Input: digits = ""
  Output: []
  Example 3:

  Input: digits = "2"
  Output: ["a","b","c"]

  Constraints:
  0 <= digits.length <= 4
  digits[i] is a digit in the range ['2', '9'].
  
  03-February-2023
*/


class Solution {  
  Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc");
    put("3", "def");
   put("4", "ghi");
   put("5", "jkl");
   put("6", "mno");
   put("7", "pqrs");
   put("8", "tuv");
   put("9", "wxyz");
  }};
  List<String> output = new ArrayList<String>();
  public void backtrack(String combination, String next_digits) {
    if (next_digits.length() == 0) {
      output.add(combination);
    }
    else {
      String digit = next_digits.substring(0, 1);
      String letters = phone.get(digit);
      for (int i = 0; i < letters.length(); i++) {
        String letter = letters.substring(i, i + 1);
        backtrack(combination + letter, next_digits.substring(1));
      }
    }
  }
  public List<String> letterCombinations(String digits) { 
    if (digits.length() != 0) {
      backtrack("", digits);
    }
    return output;
  }
}
