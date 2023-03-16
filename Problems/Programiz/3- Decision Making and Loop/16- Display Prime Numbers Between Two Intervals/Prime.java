



/*
  Output  :
  23 29 31 37 41 43 47 
  
  In this program, each number between low and high are tested for prime. The inner for loop checks whether the number is prime or not.

  You can check: Java Program to Check Prime Number for more explanation.

  The difference between checking a single prime number compared to an interval is, you need to reset the value of flag = false on each iteration of the while loop.

  Note: If you check the interval from 0 to 10. Then, you need to exclude 0 and 1. As 0 and 1 are not prime numbers. The condition will be:
  if (!flag && low != 0 && low != 1)

  16-March-2023
*/


public class Prime {

    public static void main(String[] args) {

        int low = 20, high = 50;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}
