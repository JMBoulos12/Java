



/*
  We can also convert an instance of Double class to int using the intValue() method.
  
  Here, we have used the intValue() method to convert the object of Double to int.

  The Double is a wrapper class in Java.
  
  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create an instance of Double
    Double obj = 78.6;

    // convert obj to int
    // using intValue()
    int num = obj.intValue();

    // print the int value
    System.out.println(num);    // 78
  }
}
