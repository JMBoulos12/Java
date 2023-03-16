



/*
  Output  :
  Factors of 60 are: 1 2 3 4 5 6 10 12 15 20 30 60
  
  In the above program, number whose factors are to be found is stored in the variable number (60).

  The for loop is iterated until i <= number is false. 
  In each iteration, whether number is exactly divisible by i is checked (condition for i to be the factor of number) and the value of i is incremented by 1.

  16-March-2023
*/


public class Main {

  public static void main(String[] args) {

    // positive number
    int number = 60;

    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to 60
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
