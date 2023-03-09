



/*
  In this program, you'll learn to multiply two floating point numbers in Java, store the result and display it on the screen.
  
  We have two floating-point numbers 1.5f and 2.0f stored in variables first and second respectively.

  Notice, we have used f after the numbers. This ensures the numbers are float, otherwise they will be assigned - type double.

  first and second are then multiplied using the * operator and the result is stored in a new float variable product.

  Finally, the result product is printed on the screen using println() function.

  09-March-2023
*/


public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        float first = 1.5f;
        float second = 2.0f;

        float product = first * second;

        System.out.println("The product is: " + product);
    }
}

/* 
Output  :
The product is: 3.0
 */
