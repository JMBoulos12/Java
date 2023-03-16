



/*
  In this program, you'll learn to create pyramid, half pyramid, inverted pyramid, Pascal's triangle and Floyd's triangle sing control statements in Java.
  
  *
  * *
  * * *
  * * * *
  * * * * *

  16-March-2023
*/


public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
