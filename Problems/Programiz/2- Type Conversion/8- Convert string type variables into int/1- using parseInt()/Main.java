



/*
  In this example, we have used the parseInt() method of the Integer class to convert the string variables into the int.

  Here, Integer is a wrapper class in Java.
  
  Note: The string variables should represent the int values. Otherwise the compiler will throw an exception. For example,

        class Main {
          public static void main(String[] args) {

            // create a string variable
            String str1 = "Programiz";

            // convert string to int
            // using parseInt()
            int num1 = Integer.parseInt(str1);

            // print int values
            System.out.println(num1);    // throws NumberFormatException
          }
        }

  13-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create string variables
    String str1 = "23";
    String str2 = "4566";

    // convert string to int
    // using parseInt()
    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    // print int values
    System.out.println(num1);    // 23
    System.out.println(num2);    // 4566
  }
}
