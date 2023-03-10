



/*
  10-March-2023
*/


import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // create an object of Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");

    // take the input
    String input = sc.nextLine();
    System.out.println("Original String: " + input);

    // remove white spaces
    input = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
  }
}

/*
Output  :

Enter the string
J  av  a-  P rog  ram  m ing
Original String: J  av  a-  P rog  ram  m ing
Final String: Java-Programming

In the above example, we have used the Java Scanner to take input from the user.
Here, the replaceAll() method replaces all the white spaces from the string.
*/
