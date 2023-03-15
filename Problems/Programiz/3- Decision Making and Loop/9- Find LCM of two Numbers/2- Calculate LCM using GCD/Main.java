



/*
  The output of this program is the same as problem 1- .
  
  Here, inside the for loop, we calculate the GCD of the two numbers - n1 and n2. 
  After the calculation, we use the above formula to calculate the LCM.
  
  15-March-2023
*/


public class Main {
  public static void main(String[] args) {

    int n1 = 72, n2 = 120, gcd = 1;

    for(int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    int lcm = (n1 * n2) / gcd;
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
}
