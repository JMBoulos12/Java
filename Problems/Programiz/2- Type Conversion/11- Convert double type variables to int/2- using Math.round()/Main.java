



/*
  We can also convert the double type variable into int using the Math.round() method.
  
  In this example, we have created two double variables named a and b. Notice the line:
  int c = (int)Math.round(a);
  
  Here:
  * Math.round(a) - converts the decimal value into long value
  * (int) - converts the long value into int using typecasting
  
  The Math.round() method rounds the decimal value to the closest long value.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create double variables
    double a = 99.99D;
    double b = 52.11D;

    // convert double into int
    // using typecasting
    int c = (int)Math.round(a);
    int d = (int)Math.round(b);

    System.out.println(c);    // 100
    System.out.println(d);    // 52
  }
}
