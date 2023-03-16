



/*
  Output  :
  1634 is an Armstrong number.
  
  In this program, instead of using while loop, we've used two for loops.

  The first for loop is used to count the number of digits in the number. It is the condensed form of:
  for (;originalNumber != 0; originalNumber /= 10) {
       n++;
  }
  
  The second for loop then calculates the result where on each iteration, the remainder is powered by the number of digits n.

  16-March-2023
*/


public class Armstrong {

    public static void main(String[] args) {

        int number = 1634, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
