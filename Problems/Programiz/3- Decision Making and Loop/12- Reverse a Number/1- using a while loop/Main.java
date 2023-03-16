



/*
  In this program, while loop is used to reverse a number as given in the following steps:

  * First, the remainder of the num divided by 10 is stored in the variable digit. Now, the digit contains the last digit of num, i.e. 4.
    digit is then added to the variable reversed after multiplying it by 10. Multiplication by 10 adds a new place in the reversed number. 
    One-th place multiplied by 10 gives you tenth place, tenth gives you hundredth, and so on. In this case, reversed contains 0 * 10 + 4 = 4.
    num is then divided by 10 so that now it only contains the first three digits: 123.
  * After second iteration, digit equals 3, reversed equals 4 * 10 + 3 = 43 and num = 12
  * After third iteration, digit equals 2, reversed equals 43 * 10 + 2 = 432 and num = 1
  * After fourth iteration, digit equals 1, reversed equals 432 * 10 + 1 = 4321 and num = 0
  * Now num = 0, so the test expression num != 0 fails and while loop exits. reversed already contains the reversed number 4321.
  
  Output  :
  Reversed Number: 4321

  16-March-2023
*/


class Main {
  public static void main(String[] args) {

    int num = 1234, reversed = 0;
    
    System.out.println("Original Number: " + num);

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}
