



/*
  Output
  Number of digits: 6
  
  In this program, instead of using a while loop, we use a for loop without any body.

  On each iteration, the value of num is divided by 10 and count is incremented by 1.

  The for loop exits when num != 0 is false, i.e. num = 0.

  Since, for loop doesn't have a body, you can change it to a single statement in Java as such:
  for(; num != 0; num/=10, ++count);

  16-March-2023
*/


public class Main {

  public static void main(String[] args) {

    int count = 0, num = 123456;

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
  }
}
