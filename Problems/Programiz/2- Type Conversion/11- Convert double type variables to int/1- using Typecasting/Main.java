



/*
  Here, the higher data type double is converted into a lower data type int. Hence, we need to explicitly use int inside the bracket.

  This is called narrowing typecasting.
  
  Note: This process works when the value of double is less than or equal to the maximum value of int (2147483647). 
  Otherwise, there will be a loss in data.

  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create double variables
    double a = 23.78D;
    double b = 52.11D;

    // convert double into int
    // using typecasting
    int c = (int)a;
    int d = (int)b;

    System.out.println(c);    // 23
    System.out.println(d);    // 52
  }
}
