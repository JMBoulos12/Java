



/*
  In this example, we have int type variables a and b. Notice the lines,
  long c = a;
  
  Here, the int type variable is automatically converted into long. It is because long is a higher data type and int is a lower data type.

  13-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int a = 25;
    int b = 34;

    // convert int into long
    // using typecasting
    long c = a;
    long d = b;

    System.out.println(c);    // 25
    System.out.println(d);    // 34
  }
}
