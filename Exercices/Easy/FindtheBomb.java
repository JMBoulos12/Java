


/*
  Write a function that finds the word "bomb" in the given string (not case sensitive). Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".

  Examples
  bomb("There is a bomb.") ➞ "DUCK!"

  bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"

  bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
  Notes
  The string "bomb" may appear in different character cases (i.e. uppercase, lowercase, mixed). 
  19-January-2023
*/

public class FindTheBomb {
  public static String bomb(String str) {
    String l = str.toLowerCase();
    if (l.contains("bomb")) {
      return "DUCK!";
    } 
    return "Relax, there's no bomb.";
  }
}
