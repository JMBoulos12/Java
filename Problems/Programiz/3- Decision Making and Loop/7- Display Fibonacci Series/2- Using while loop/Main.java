



/*
  Output  :
  Fibonacci Series till 10 terms:
  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
  
  The working of this program is the same as the previous program.

  And, though both programs are technically correct, it is better to use a for loop in this case. It's because the number of iterations (from 1 to n) is known.

  15-March-2023
*/


class Main {
  public static void main(String[] args) {

    int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    while (i <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      i++;
    }
  }
}
