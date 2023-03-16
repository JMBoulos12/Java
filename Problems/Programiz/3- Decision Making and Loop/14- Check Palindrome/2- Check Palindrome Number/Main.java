



/*
  Output  :
  3553 is Palindrome.
  
  In the above example, we have a number 3553 stored in num and originalNum variables. Here, we have used the :
  * while loop to reverse num and store the reversed number in reversedNum
  * if...else to check if reversedNum is same as the originalNum

  16-March-2023
*/


class Main {
  public static void main(String[] args) {
    
    int num = 3553, reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}
