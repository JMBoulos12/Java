



/*
  Output
  Answer = 81
  
  Here, instead of using a while loop, we've used a for loop.

  After each iteration, the exponent is decremented by 1, and the result is multiplied by the base exponent number of times.

  Both programs above do not work if you have a negative exponent. For that, you need to use the pow() function in Java standard library.

  16-March-2023
*/


class Main {
  public static void main(String[] args) {

    int base = 3, exponent = 4;

    long result = 1;

    for (; exponent != 0; --exponent) {
      result *= base;
    }

    System.out.println("Answer = " + result);
  }
}
