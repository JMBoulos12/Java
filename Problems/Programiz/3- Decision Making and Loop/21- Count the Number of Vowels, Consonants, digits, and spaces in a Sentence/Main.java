



/*
  Output  :
  Vowels: 7
  Consonants: 11
  Digits: 2
  White spaces: 3
  
  In the above example, we've 4 conditions for each of the checks.

  * The first if condition is to check whether the character is a vowel or not.
  * The else if condition following if is to check whether the character is a consonant or not. This condition is checked only when the if condition is false.
  * The second else if is to check whether the character is between 0 to 9 or not.
  * Finally, the last condition is to check whether the character is a space character or not.
  
  For this, we've lowercased the line using toLowerCase(). This is an optimization done not to check for capitalized A to Z and vowels.

  We've used length() function to know the length of the string and charAt() to get the character at the given index (position).

  16-March-2023
*/


class Main {

  public static void main(String[] args) {
    String line = "This website is aw3som3.";
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    line = line.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);

      // check if character is any of a, e, i, o, u
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }

      // check if character is in between a to z
      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
      }
      
      // check if character is in between 0 to 9
      else if (ch >= '0' && ch <= '9') {
        ++digits;
      }
      
      // check if character is a white space
      else if (ch == ' ') {
        ++spaces;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
  }
}
