



/*
  Output  :
  Fibonacci Series till 10 terms:
  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
  
  In this program, firstTerm and secondTerm are initialized with 0 and 1 respectively (first two digits of Fibonacci series).

  Here, we have used the for loop to
  * print the firstTerm of the series
  * compute nextTerm by adding firstTerm and secondTerm
  * assign value of secondTerm to firstTerm and nextTerm to secondTerm

  15-March-2023
*/


class Main {
  public static void main(String[] args) {

    int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
