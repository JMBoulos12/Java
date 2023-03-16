



/*
  Output  :
  29 is a prime number.
  
  In the above program, for loop is used to determine if the given number num is prime or not.

  Here, note that we are looping from 2 to num/2. It is because a number is not divisible by more than its half.

  Inside the for loop, we check if the number is divisible by any number in the given range (2...num/2).
  
  * If num is divisible, flag is set to true and we break out of the loop. This determines num is not a prime number.
  * If num isn't divisible by any number, flag is false and num is a prime number.

  16-March-2023
*/


public class Main {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
