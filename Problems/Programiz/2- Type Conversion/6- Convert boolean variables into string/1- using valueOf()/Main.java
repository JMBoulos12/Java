



/*
  In this example, we have used the valueOf() method of String class to convert the boolean variables into strings.
  
  13-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create boolean variables
    boolean booleanValue1 = true;
    boolean booleanValue2 = false;

    // convert boolean to string
    // using valueOf()
    String stringValue1 = String.valueOf(booleanValue1);
    String stringValue2 = String.valueOf(booleanValue2);

    System.out.println(stringValue1);    // true
    System.out.println(stringValue2);    // true
  }
}
