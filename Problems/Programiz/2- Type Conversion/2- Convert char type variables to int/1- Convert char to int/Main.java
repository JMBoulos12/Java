



/*
  In the above example, we have char type variables a and b. Note that we have assigned the char variables to int variables.

  Here, instead of the characters, the ASCII value of the characters are assigned to the int variables. 
  Hence, we get the value 53 (ASCII value of '5') and 99 (ASCII value of 'c') as output.

  10-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = 'c';

    // convert char variables to int
    // ASCII value of characters is assigned
    int num1 = a;
    int num2 = b;

    // print the values
    System.out.println(num1);    // 53
    System.out.println(num2);    // 99
  }
}
