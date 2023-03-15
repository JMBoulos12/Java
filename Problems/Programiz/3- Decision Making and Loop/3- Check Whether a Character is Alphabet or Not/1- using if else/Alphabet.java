



/*
  In this program, you'll learn to check whether a given character is an alphabet or not. This is done using an if else statement or a ternary operator in Java.
  
  Output  :
  * is not an alphabet.
  
  In Java, the char variable stores the ASCII value of a character (number between 0 and 127) rather than the character itself.

  The ASCII value of lowercase alphabets are from 97 to 122. And, the ASCII value of uppercase alphabets are from 65 to 90. 
  That is, alphabet a is stored as 97 and alphabet z is stored as 122. Similarly, alphabet A is stored as 65 and alphabet Z is stored as 90.

  Now, when we compare variable c between 'a' to 'z' and 'A' to 'Z', the variable is compared with the ASCII value of the alphabets 97 to 122 and 65 to 90 respectively.

  Since the ASCII value of * does not fall in between the ASCII value of alphabets. Hence, the program outputs * is not an alphabet.

  15-March-2023
*/


public class Alphabet {

    public static void main(String[] args) {

        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
