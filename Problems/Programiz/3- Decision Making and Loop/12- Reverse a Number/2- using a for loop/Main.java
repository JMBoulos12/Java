



/*
  In the above program, the while loop is replaced by a for loop where:

  * no initialization expression is used
  * test expression remains the same (num != 0)
  * update/increment expression contains num /= 10.
  
  So, after each iteration, the update expression runs which removes the last digit of num.

  When the for loop exits, reversed will contain the reversed number.
  
  Output  :
  Reversed Number: 7654321

  16-March-2023
*/


class Main {
  public static void main(String[] args) {
    
    int num = 1234567, reversed = 0;

    for(;num != 0; num /= 10) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}
