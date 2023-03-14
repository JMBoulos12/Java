



/*
  In this example, we have used the parseDouble() method of the Double class to convert the string variables into double.

  Here, Double is a wrapper class in Java.
  
  Note: The string variables should represent the number value. Otherwise, the compiler will throw an exception. For example,

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create string variables
    String str1 = "23";
    String str2 = "456.6";

    // convert string to double
    // using parseDouble()
    double num1 = Double.parseDouble(str1);
    double num2 = Double.parseDouble(str2);

    // print double values
    System.out.println(num1);    // 23.0
    System.out.println(num2);    // 456.6
  }
}
