



/*
  Here, we have used the format() method to format the specified int variable into a string.
  
  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create a int variable
    int num = 9999;

    // convert int to string using format()
    String str = String.format("%d", num);

    System.out.println(str);    // 9999
  }
}
