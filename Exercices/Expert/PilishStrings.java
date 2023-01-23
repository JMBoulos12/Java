




/*
  In this challenge, transform a string into a series of words (or sequences of characters) separated by a single space, with each word having the same length given by the first 15 digits of the decimal representation of Pi:

  3.14159265358979
  If a string contains more characters than the total quantity given by the sum of the Pi digits, the unused characters are discarded and you will use only those needed to form 15 words.

  String = "HOWINEEDADRINKALCOHOLICINNATUREAFTERTHEHEAVYLECTURESINVOLVINGQUANTUMMECHANICSANDALLTHESECRETSOFTHEUNIVERSE"

  Pi String = "HOW I NEED A DRINK ALCOHOLIC IN NATURE AFTER THE HEAVY LECTURES INVOLVING QUANTUM MECHANICS"

  // Every word has the same length of the digit of Pi found at the same index ?
  // "HOW" = 3, "I" = 1, "NEED" = 4, "A" = 1, "DRINK" = 5
  // "ALCOHOLIC" = 9, "IN" = 2, "NATURE" = 6, "AFTER" = 5
  // "THE" = 3, "HEAVY" = 5, "LECTURES" = 8, "INVOLVING" = 9
  // "QUANTUM" = 7, "MECHANICS" = 9
  // 3.14159265358979
  Also if a string contains less characters than the total quantity given by the sum of the Pi digits, in any case you have to respect the sequence of the digits to obtain the words.

  String = "FORALOOP"

  Pi String = "FOR A LOOP"

  // Every word has the same length of the digit of Pi found at the same index ?
  // "FOR" = 3, "A" = 1, "LOOP" = 4
  // 3.14
  If the letters contained in the string don't match exactly the digits, in this case you will repeat the last letter until the word will have the correct length.

  String = "CANIMAKEAGUESSNOW"

  Pi String = "CAN I MAKE A GUESS NOWWWWWWW"

  // Every word has the same length of the digit of Pi found at the same index ?
  // "CAN" = 3, "I" = 1, "MAKE" = 4, "A" = 1, "GUESS" = 5, "NOW" = 3
  // 3.14153 (Wrong!)
  // The length of the sixth word "NOW" (3)...
  // ...doesn't match the sixth digit of Pi (9)
  // The last letter "W" will be repeated...
  // ...until the length of the word will match the digit

  // "CAN" = 3, "I" = 1, "MAKE" = 4, "A" = 1, "GUESS" = 5, "NOWWWWWWW" = 9
  // 3.14159 (Correct!)
  If the given string is empty, an empty string has to be returned.

  Given a string txt, implement a function that returns the same string formatted accordingly to the above instructions.

  Examples
  pilish_string("33314444") ➞ "333 1 4444"
  // 3.14

  pilish_string("TOP") ➞ "TOP"
  // 3

  pilish_string("X")➞ "XXX"
  // "X" has to match the same length of the first digit (3)
  // The last letter of the word is repeated

  pilish_string("")➞ ""
  Notes
  This challenge is a simplified concept inspired by the Pilish, a peculiar type of constrained writing that uses all the known possible digits of Pi. A potentially infinite text can be written allowing punctuation and a set of additional rules, that permits to avoid long sequences of small digits, substituting them with words bigger than 9 letters and making so appear the composition more similar to a free-verse poem.
  The dot that separes the integer part of Pi from the decimal part hasn't to be considered in the function: it's present in Instructions and Examples only for readability.

  23-January-2023
*/

public class Challenge {
  static final int[] PI = new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9};
  
  public static String pilish_string(String s) {
    String ans = "";
      int idx = 0;
      int l;
      String word;
      while(s.length() > 0 && idx < PI.length){
        l = PI[idx];
        if(s.length() >= l)
          word = s.substring(0, l);
        else
          word = s;
        while(word.length() < l)
          word += word.charAt(word.length() - 1);
        ans += " " + word;
        if(s.length() >= l)
          s = s.substring(l);
        else
          s = "";
        idx++;
      }
    return ans.trim();
  }
}
