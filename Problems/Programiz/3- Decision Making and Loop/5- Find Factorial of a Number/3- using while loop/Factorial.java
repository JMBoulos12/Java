



/*
  Output  :
  Factorial of 5 = 120
  
  In this program, unlike a for loop, we have to increment the value of i inside the body of the loop.

  Though both programs are technically correct, it is better to use for loop in this case. It's because the number of iteration (upto num) is known.

  15-March-2023
*/


public class Factorial {

    public static void main(String[] args) {

        int num = 5, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
