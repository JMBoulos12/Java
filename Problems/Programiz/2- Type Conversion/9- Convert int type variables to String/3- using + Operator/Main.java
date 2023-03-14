



/*
  Notice the line,

  String str1 = "" + num1;
  Here, we are using the string concatenation operation to convert an integer into the string.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 3476;
    int num2 = 8656;

    // convert int to string
    // using + sign
    String str1 = "" + num1;
    String str2 = "" + num2;

    // print string variables
    System.out.println(str1);    // 3476
    System.out.println(str2);    // 8656
  }
}
