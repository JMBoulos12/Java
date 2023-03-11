



/*
  Here, we are using typecasting to covert an int type variable into the char type variable.

  Note that the int values are treated as ASCII values. 
  Hence, we get P for int value 80 and Q for int value 81. 
  It is because the ASCII value of P and Q are 80 and 81 respectively.

  10-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 80;
    int num2 = 81;

    // convert int to char
    // typecasting
    char a = (char)num1;
    char b = (char)num2;

    // print value
    System.out.println(a);    // P
    System.out.println(b);    // Q
  }
}

/*
In the above example, we have int type variables num1 and num2. Notice the line,

char a = (char)num1;

*/
