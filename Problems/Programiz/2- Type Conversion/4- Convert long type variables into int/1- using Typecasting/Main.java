



/*
  Here, the higher data type long is converted into the lower data type int. 
  Hence, this is called narrowing typecasting. To learn more, visit Java Typecasting.

  This process works fine when the value of the long variable is less than or equal to the maximum value of int (2147483647). 
  However, if the value of the long variable is greater than the maximum int value, then there will be a loss in data. 
  
  12-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create long variables
    long a = 2322331L;
    long b = 52341241L;

    // convert long into int
    // using typecasting
    int c = (int)a;
    int d = (int)b;

    System.out.println(c);    // 2322331
    System.out.println(d);    // 52341241
  }
}

/* In the above example, we have long type variables a and b. Notice the lines,

int c = (int)a; */
