



/*
  Output  :
  Fibonacci Series Upto 100:
  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
  
  In this example, instead of displaying the Fibonacci series of a certain number, we are displaying the series up to the given number (100).

  For this, we just need to compare the firstTerm with n. And, if firstTerm is less than n, it is printed in the series. Else, the series is completed.

  15-March-2023
*/


class Fibonacci {
  public static void main(String[] args) {

    int n = 100, firstTerm = 0, secondTerm = 1;
        
    System.out.println("Fibonacci Series Upto " + n + ": ");
    
    while (firstTerm <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
  }
}
