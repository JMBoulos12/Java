



/*
  We can also compute the power of a negative number using the pow() method.
  
  Here, we have used the pow() method to compute the power of a negative number -3.
  
  Output  :
  Answer = 9.0
  
  16-March-2023
*/


class Main {
  public static void main(String[] args) {

    // negative number
    int base = -3, exponent = 2;

    double result = Math.pow(base, exponent);
    System.out.println("Answer = " + result);
  }
}
