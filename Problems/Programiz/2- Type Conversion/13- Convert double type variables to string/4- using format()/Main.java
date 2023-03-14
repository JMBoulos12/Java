



/*
  Here, we have used the format() method to format the specified double variable into a string.
  
  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create a double variable
    double num = 99.99;

    // convert double to string using format()
    String str = String.format("%f", num);

    System.out.println(str);    // 99.990000
  }
}
