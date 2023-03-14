



/*
  In this example, we have used the valueOf() method of the String class to convert the double variables into strings.

  Note: This is the most preferred way of converting double variables to string in Java.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create double variable
    double num1 = 36.33;
    double num2 = 99.99;

    // convert double to string
    // using valueOf()
    String str1 = String.valueOf(num1);
    String str2 = String.valueOf(num2);

    // print string variables
    System.out.println(str1);    // 36.33
    System.out.println(str2);    // 99.99
  }
}
