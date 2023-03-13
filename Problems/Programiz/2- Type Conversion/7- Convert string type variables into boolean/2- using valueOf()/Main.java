



/*
  We can also convert the string variables into boolean using the valueOf() method.
  
  In the above example, the valueOf() method of Boolean class converts the string variables into boolean.

  Here, the valueOf() method actually returns an object of the Boolean class. 
  However, the object is automatically converted into a primitive type. 

  13-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create string variables
    String str1 = "true";
    String str2 = "false";

    // convert string to boolean
    // using valueOf()
    boolean b1 = Boolean.valueOf(str1);
    boolean b2 = Boolean.valueOf(str2);

    // print boolean values
    System.out.println(b1);    // true
    System.out.println(b2);    // false
  }
}
