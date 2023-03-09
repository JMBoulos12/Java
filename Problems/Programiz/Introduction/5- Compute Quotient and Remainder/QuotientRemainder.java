



/*
  In this program, you'll learn to compute quotient and remainder from the given dividend and divisor in Java.
  
  09-March-2023
*/


public class QuotientRemainder {

  public static void main(String[] args) {

    int dividend = 25, divisor = 4;

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
  }
}

/*
  Output:

  Quotient = 6
  Remainder = 1
  In the above program, we have created two variables dividend and divisor. Here, we are calculating the quotient and remainder by dividing 25 by 4.

  To find the quotient, we have used the / operator. We have divided dividend (25) by divisor (4). 
  Since both dividend and divisor are integers, the result will also be integer.

  25 / 4 // results 6.5
  // convert 6.5 to integer
  // output will be 6
  Likewise, to find the remainder we use the % operator. Here, the dividend is divided by the divisor and the remainder is returned by the % operator.

  25 % 4 // results 1
  Finally, quotient and remainder are printed on the screen using println() function.
*/
