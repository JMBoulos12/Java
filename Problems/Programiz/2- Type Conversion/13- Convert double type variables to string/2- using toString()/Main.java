



/*
  We can also convert the double variables into strings using the toString() method of the Double class.
  
  Here, we have used the toString() method of the Double class to convert the double variables into a string.
  
  The Double is a wrapper class in Java.
  
  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create double variables
    double num1 = 4.76;
    double num2 = 786.56;

    // convert double to string
    // using toString()
    String str1 = Double.toString(num1);
    String str2 = Double.toString(num2);

    // print string variables
    System.out.println(str1);    // 4.76
    System.out.println(str2);    // 786.56
  }
}
