



/*
  The factorial of a positive number n is given by:
  factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
  
  Output  :
  Factorial of 10 = 3628800
  
  In this program, we've used for loop to loop through all numbers between 1 and the given number num (10), 
  and the product of each number till num is stored in a variable factorial.

  We've used long instead of int to store large results of factorial. However, it's still not big enough to store the value of bigger numbers (say 100).

  For results that cannot be stored in a long variable, we use BigInteger variable declared in java.math library.

  15-March-2023
*/


public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
