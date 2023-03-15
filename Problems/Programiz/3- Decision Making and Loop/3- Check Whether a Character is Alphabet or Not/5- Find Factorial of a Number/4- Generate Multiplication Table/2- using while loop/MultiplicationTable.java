



/*
  Output  :
  9 * 1 = 9
  9 * 2 = 18
  9 * 3 = 27
  9 * 4 = 36
  9 * 5 = 45
  9 * 6 = 54
  9 * 7 = 63
  9 * 8 = 72
  9 * 9 = 81
  9 * 10 = 90
  
  In this program, unlike a for loop, we have to increment the value of i inside the body of the loop.

  Though both programs are technically correct, it is better to use for loop in this case. 
  It's because the number of iteration (from 1 to 10) is known.

  15-March-2023
*/


public class MultiplicationTable {

    public static void main(String[] args) {

        int num = 9, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
