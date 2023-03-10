



/*
  In Java, we can also convert the character into an integer by subtracting it with character 0. For example,
  
  Here, we have subtracted the character 'a' by the character '0'. In this case, the characters are converted into integers. 
  And subtracting a value by zero gives the same value. That is, 9 - 0 = 9.

  Hence, we get the integer values 9 and 3 of the character '9' and '3' respectively.

  10-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '9';
    char b = '3';

    // convert char variables to int
    // by subtracting with char 0
    int num1 = a - '0';
    int num2 = b - '0';

    // print numeric value
    System.out.println(num1);    // 9
    System.out.println(num2);    // 3
  }
}

/*
In the above example, notice the line,

int num1 = a -'0';
*/
