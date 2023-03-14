



/*
  Output  :
  1- The value of int variable: 23
  2- The value of double variable: 5.55
  3- The value of boolean variable: true
  
  In the above example, we have created objects of Wrapper class (Integer, Double, and Boolean).
  
  We then change the objects into corresponding primitive types (int, double, and boolean) using the intValue(), doubleValue(), and booleanValue() methods respectively.

  Note: The Java compiler automatically converts the primitive types into corresponding objects and vice versa. This process is known as autoboxing and unboxing.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // creates objects of wrapper class
    Integer obj1 = Integer.valueOf(23);
    Double obj2 = Double.valueOf(5.55);
    Boolean obj3 = Boolean.valueOf(true);

    // converts into primitive types
    int var1 = obj1.intValue();
    double var2 = obj2.doubleValue();
    boolean var3 = obj3.booleanValue();

    // print the primitive values
    System.out.println("The value of int variable: " + var1);
    System.out.println("The value of double variable: " + var2);
    System.out.println("The value of boolean variable: " + var3);
  }
}
