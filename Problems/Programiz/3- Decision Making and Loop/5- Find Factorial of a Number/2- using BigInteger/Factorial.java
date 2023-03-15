



/*
  Output  :
  Factorial of 30 = 265252859812191058636308480000000
  
  Here, instead of long, we use BigInteger variable factorial.

  Since, * cannot be used with BigInteger, we instead use multiply() for the product. Also, num should be casted to BigInteger for multiplication.

  15-March-2023
*/


import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
