



/*
  We can also use the forDigit() method of the Character class to convert the int type variable into char type.
  
  We have used the forDigit() method converts the specified int value into char value.

  Here, 10 and 16 are radix values for decimal and hexadecimal numbers respectively. 
  That is, if the int value is between 0 to 9, we use 10 as radix value, if the int value is between 0 to 15, we use 16, and so on.

  10-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 1;
    int num2 = 13;

    // convert int to char
    // for value between 0-9
    char a = Character.forDigit(num1, 10);

    // for value between 0-9
    char b = Character.forDigit(num2, 16);

    // print value
    System.out.println(a);    // 1
    System.out.println(b);    // d
  }
}

/*
Notice the expression,

char a = Character.forDigit(num1, 10);

*/
