



/*
  Output  :
  371 is an Armstrong number.
  
  * First, given number (number)'s value is stored in another integer variable, originalNumber. 
    This is because, we need to compare the values of final number and original number at the end.
  * Then, a while loop is used to loop through originalNumber until it is equal to 0.
      - On each iteration, the last digit of num is stored in remainder.
      - Then, remainder is powered by 3 (number of digits) using Math.pow() function and added to result.
      - Then, the last digit is removed from originalNumber after division by 10.
  * Finally, result and number are compared. If equal, it is an Armstrong number. If not, it isn't.

  16-March-2023
*/


public class Armstrong {

    public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
