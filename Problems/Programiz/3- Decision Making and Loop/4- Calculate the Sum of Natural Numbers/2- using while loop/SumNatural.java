



/*
  Output
  Sum = 1275
  
  In the above program, unlike a for loop, we have to increment the value of i inside the body of the loop.

  Though both programs are technically correct, it is better to use for loop in this case. 
  It's because the number of iteration (up to num) is known.

  15-March-2023
*/


public class SumNatural {

    public static void main(String[] args) {

        int num = 50, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
