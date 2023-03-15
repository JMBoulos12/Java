



/*
  In this program, you'll learn to check whether a given character is an alphabet or not. 
  This is done using an if else statement or a ternary operator in Java.
  
  Output  :
  A is an alphabet.
  
  In the above program, the if else statement is replaced with ternary operator (? :).

  15-March-2023
*/


public class Alphabet {

    public static void main(String[] args) {

        char c = 'A';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
    }
}
