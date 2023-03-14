



/*
  In this example, we have int type variables a and b. Notice the line:
  double c = a;
  
  Here, the int type variable is automatically converted into double. 
  It is because double is a higher data type (data type with larger size) and int is a lower data type (data type with smaller size).
  
  Hence, there will be no loss in data while converting from int to double. This is called widening typecasting.
  
  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int a =33;
    int b = 29;

    // convert int into double
    // using typecasting
    double c = a;
    double d = b;

    System.out.println(c);    // 33.0
    System.out.println(d);    // 29.0
  }
}
