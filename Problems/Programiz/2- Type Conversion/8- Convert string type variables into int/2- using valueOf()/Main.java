



/*
  We can also convert the string variables into an object of Integer using the valueOf() method.
  
  In the above example, the valueOf() method of Integer class converts the string variables into the int.

  Here, the valueOf() method actually returns an object of the Integer class. However, the object is automatically converted into the primitive type. 
  This is called unboxing in Java.
  
  That is :
  // valueOf() returns object of Integer
  // object is converted onto int
  int num1 = Integer obj = Integer.valueOf(str1)

  13-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create string variables
    String str1 = "643";
    String str2 = "1312";

    // convert String to int
    // using valueOf()
    int num1 = Integer.valueOf(str1);
    int num2 = Integer.valueOf(str2);

    // print int values
    System.out.println(num1);    // 643
    System.out.println(num2);    // 1312
  }
}
