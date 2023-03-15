



/*
  The positive numbers 1, 2, 3... are known as natural numbers and its sum is the result of all numbers starting from 1 to the given number.

  For n, the sum of natural numbers is:
  1 + 2 + 3 + ... + n

  Output  :
  Sum = 5050
  
  The above program loops from 1 to the given num(100) and adds all numbers to the variable sum.
  
  15-March-2023
*/


public class SumNatural {

    public static void main(String[] args) {

        int num = 100, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
