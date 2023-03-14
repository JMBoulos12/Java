



/*
  We can also convert the string variables into a double using the valueOf() method.
  
  In the above example, the valueOf() method of Double class converts the string values into the double.

  Here, the valueOf() method actually returns an object of the Double class. 
  However, the object is automatically converted into the primitive type. This is called unboxing in Java.
  
  That is,

  // valueOf() returns object of Double
  // object is converted into double
  double num1 = Double obj = Double.valueOf(str1);

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create string variables
    String str1 = "6143";
    String str2 = "21312";

    // convert String to double
    // using valueOf()
    double num1 = Double.valueOf(str1);
    double num2 = Double.valueOf(str2);

    // print double values
    System.out.println(num1);    // 6143.0
    System.out.println(num2);    // 21312.0
  }
}
