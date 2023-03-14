



/*
  Output  :
  1-  An object of Integer is created.
  2-    An object of Double is created.
  3-      An object of Boolean is created.

  In the above example, we have created variables of primitive types (int, double, and boolean). 
  Here, we have used the valueOf() method of the Wrapper class (Integer, Double, and Boolean) to convert the primitive types to the objects.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create primitive types
    int var1 = 5;
    double var2 = 5.65;
    boolean var3 = true;

    //converts into wrapper objects
    Integer obj1 = Integer.valueOf(var1);
    Double obj2 = Double.valueOf(var2);
    Boolean obj3 = Boolean.valueOf(var3);

    // checks if obj are objects of
    // corresponding wrapper class
    if(obj1 instanceof Integer) {
      System.out.println("An object of Integer is created.");
    }

    if(obj2 instanceof Double) {
      System.out.println("An object of Double is created.");
    }

    if(obj3 instanceof Boolean) {
      System.out.println("An object of Boolean is created");
    }
  }
}
