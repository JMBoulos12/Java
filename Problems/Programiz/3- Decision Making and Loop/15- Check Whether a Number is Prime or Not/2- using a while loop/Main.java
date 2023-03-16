



/*
  Output  :
  33 is not a prime number.
  
  In the above program, while loop is used instead of a for loop. 
  The loop runs until i <= num/2. On each iteration, whether num is divisble by i is checked and the value of i is incremented by 1.

  16-March-2023
*/


public class Main {

  public static void main(String[] args) {

    int num = 33, i = 2;
    boolean flag = false;
    while (i <= num / 2) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
