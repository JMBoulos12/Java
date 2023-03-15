



/*
  Output
  a is an alphabet.
  
  In the above example, notice the expression,
  Character.isAlphabetic(c)
  
  Here, we have used the isAlphabetic() method of the Character class. It returns true if the specified variable is an alphabet. Hence, the code inside if block is executed.

  15-March-2023
*/


class Main {
  public static void main(String[] args) {

    // declare a variable
    char c = 'a';

    // checks if c is an alphabet
    if (Character.isAlphabetic(c)) {
      System.out.println(c + " is an alphabet.");
    }
    else {
      System.out.println(c + " is not an alphabet.");
    }
  }
}
