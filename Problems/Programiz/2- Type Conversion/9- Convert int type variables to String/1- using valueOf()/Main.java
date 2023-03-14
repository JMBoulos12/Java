



/*
  In the above example, we have used the valueOf() method of the String class to convert the int variables into string.

  Note: This is the most preferred way of converting int variables to string in Java.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variable
    int num1 = 36;
    int num2 = 99;

    // convert int to string
    // using valueOf()
    String str1 = String.valueOf(num1);
    String str2 = String.valueOf(num2);

    // print string variables
    System.out.println(str1);    // 36
    System.out.println(str2);    // 99
  }
}
