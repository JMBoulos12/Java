



/*
  We can also convert the int variable into string using the toString() method of the Integer class.
  
  In this example, we have used the toString() method of the Integer class to convert the int variables into string.

  Here, Integer is the wrapper class.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 476;
    int num2 = 78656;

    // convert int to string
    // using toString()
    String str1 = Integer.toString(num1);
    String str2 = Integer.toString(num2);

    // print string variables
    System.out.println(str1);    // 476
    System.out.println(str2);    // 78656
  }
}
