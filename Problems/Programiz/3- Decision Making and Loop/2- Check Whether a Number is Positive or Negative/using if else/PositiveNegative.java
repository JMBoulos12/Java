



/*
  Output  :
  12.3 is a positive number.
  
  If you change the value of number to a negative number (say -12.3), the output will be:
  -12.3 is a negative number.
  
  In the above program, it is quite clear how the variable number is checked to be positive or negative, by comparing it to 0.

  If you're not sure, here is the breakdown:

  * If a number is greater than zero, it is a positive number.
  * If a number is less than zero, it is a negative number.
  * If a number equals to zero, it is zero.

  14-March-2023
*/


public class PositiveNegative {

    public static void main(String[] args) {

        double number = 12.3;

        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }
}
