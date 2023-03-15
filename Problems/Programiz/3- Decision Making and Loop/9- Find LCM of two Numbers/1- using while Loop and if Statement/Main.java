



/*
  Output:
  The LCM of 72 and 120 is 360.
  
  In this program, the two numbers whose LCM is to be found are stored in variables n1 and n2 respectively.

  Then, we initially set lcm to the largest of the two numbers. This is because, LCM cannot be less than the largest number.

  Inside the infinite while loop (while(true)), we check if lcm perfectly divides both n1 and n2 or not.

  If it does, we've found the LCM. We print the LCM and break out from the while loop using break statement.

  Else, we increment lcm by 1 and re-test the divisibility condition.

  15-March-2023
*/


public class Main {
  public static void main(String[] args) {

    int n1 = 72, n2 = 120, lcm;

    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}
