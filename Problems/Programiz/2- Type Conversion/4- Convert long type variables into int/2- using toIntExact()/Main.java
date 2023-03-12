



/*
  We can also use the toIntExact() method of the Math class to convert the long value into an int.
  
  Here, the Math.toIntExact(value1) method converts the long variable value1 into int and returns it.

  The toIntExact() method throws an exception if the returned int value is not within the range of the int data type. That is,

  // value out of range of int
  long value = 32147483648L

  // throws the integer overflow exception
  int num = Math.toIntExact(value);

  12-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create long variable
    long value1 = 52336L;
    long value2 = -445636L;

    // change long to int
    int num1 = Math.toIntExact(value1);
    int num2 = Math.toIntExact(value2);

    // print the int value
    System.out.println(num1);  // 52336
    System.out.println(num2);  // -445636
  }
}
