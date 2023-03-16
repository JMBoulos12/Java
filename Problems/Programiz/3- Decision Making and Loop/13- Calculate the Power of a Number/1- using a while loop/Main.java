



/*
  Output  :
  Answer = 81
  
  In this program, base and exponent are assigned values 3 and 4 respectively.

  Using the while loop, we keep on multiplying the result by base until the exponent becomes zero.

  In this case, we multiply result by base 4 times in total, so result = 1 * 3 * 3 * 3 * 3 = 81.

  16-March-2023
*/


class Main {
  public static void main(String[] args) {

    int base = 3, exponent = 4;

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
  }
}
