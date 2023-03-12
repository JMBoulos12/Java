



/*
  In Java, we can also convert the object of wrapper class Long into an int. For this, we can use the intValue() method. For, example, 
  
  Here, we have created an object of the Long class named obj. We then used the intValue() method to convert the object into int type.
  
  12-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create an object of Long class
    Long obj = 52341241L;

    // convert object of Long into int
    // using intValue()
    int a = obj.intValue();

    System.out.println(a);    // 52341241
  }
}
