



/*
  In Java, we can also convert the integer into a character by adding the character '0' with it.
  
  Here, the character '0' is converted into ASCII value 48. The value 48 is added to the value of num1 (i.e. 1). The result 49 is the ASCII value of 1. 
  Hence, we get the character '1' as the output.
  
  Note: This is only applicable for int value 0 to 9.
  
  10-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 1;
    int num2 = 9;

    // convert int to char
    char a = (char)(num1 + '0');
    char b = (char)(num2 + '0');

    // print value
    System.out.println(a);    // 1
    System.out.println(b);    // 9
  }
}

/*
In the above example, notice the line,

char a = (char)(num1 + '0');

*/
