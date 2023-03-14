



/*
  We can also convert the int type variable into an object of the Double class.
  
  In the above example, we have used the Double.valueOf() method to convert the variable a into an object of Double.

  Here, Double is a wrapper class in Java.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int a = 332;

    // convert to an object of Double
    // using valueOf()
    Double obj = Double.valueOf(a);

    System.out.println(obj);    // 332.0
  }
}
