



/*
  We can convert the int type variable into an object of the Long class.
  
  In this example, we have used the Long.valueOf() method to convert the variable a into an object of Long.

  Here, Long is a wrapper class in Java.

  13-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int a = 251;

    // convert to an object of Long
    // using valueOf()
    Long obj = Long.valueOf(a);

    System.out.println(obj);    // 251
  }
}
