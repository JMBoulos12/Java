



/*
  A positive integer is called an Armstrong number of order n if
  abcd... = an + bn + cn + dn + ...
  
  In case of an Armstrong number of 3 digits, the sum of cubes of each digit is equal to the number itself. For example:
  153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
  
  Output  :
  1634 8208 9474 54748 92727 93084 
  
  In the above program, each number between the given interval high and low is checked.

  After each check, the number of digits and the sum result is restored to 0.

  16-March-2023
*/


class Main {
  public static void main(String[] args) {

    int low = 999, high = 99999;

    for(int number = low + 1; number < high; ++number) {
      int digits = 0;
      int result = 0;
      int originalNumber = number;

      // number of digits calculation
      while (originalNumber != 0) {
        originalNumber /= 10;
        ++digits;
      }

      originalNumber = number;

      // result contains sum of nth power of its digits
      while (originalNumber != 0) {
        int remainder = originalNumber % 10;
        result += Math.pow(remainder, digits);
        originalNumber /= 10;
      }

      if (result == number) {
        System.out.print(number + " ");
      }
    }
  }
}
