



/*
  In this program, you'll learn to remove all whitespaces in a given string using regular expressions in Java.
  
  we use String's replaceAll() method to remove and replace all whitespaces in the string sentence.

  To learn more, visit Java String replaceAll().

  We've used regular expression \\s that finds all white space characters (tabs, spaces, new line character, etc.) in the string. 
  Then, we replace it with "" (empty string literal).

  10-March-2023
*/


public class Whitespaces {

    public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}

/*
Output

Original sentence: T    his is b  ett     er.
After replacement: Thisisbetter.
*/
