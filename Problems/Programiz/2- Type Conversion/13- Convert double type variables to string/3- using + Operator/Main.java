



/*
  Notice the line,

  String str1 = "" + num1;
  
  Here, we are using the string concatenation operation to convert a double variable into the string.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create double variables
    double num1 = 347.6D;
    double num2 = 86.56D;

    // convert double to string
    // using + sign
    String str1 = "" + num1;
    String str2 = "" + num2;

    // print string variables
    System.out.println(str1);    // 347.6
    System.out.println(str2);    // 86.56
  }
}
