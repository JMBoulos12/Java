



/*
  Output  :
  Factors of -60 are: -60 -30 -20 -15 -12 -10 -6 -5 -4 -3 -2 -1 1 2 3 4 5 6 10 12 15 20 30 60  
  
  In the above example, we have computed all the factors of a negative number. Here, the for loop runs from -60 to 60.

  And, when the value of i is 0, the iteration is skipped. Otherwise, there will be an exception.

  Note: The Math.abs() method returns the absolute value of the number.

  16-March-2023
*/


class Main {

  public static void main(String[] args) {

    // negative number
    int number = -60;
    System.out.print("Factors of " + number + " are: ");

    // run loop from -60 to 60
    for(int i = number; i <= Math.abs(number); ++i) {

      // skips the iteration for i = 0
      if(i == 0) {
        continue;
      }
      else {
        if (number % i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
}
