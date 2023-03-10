



/*
  We can also use the parseInt() method of the Integer class to convert the char type variable to an int type.
  
  * String.valueOf(a) - converts the char type variable a into a String
  * Integer.parseInt() - converts the string into an int
  
  Note: The Integer.parseInt() method only works with string type variables. Hence, the character 'a' is converted into a String.
  
  10-March-2023
*/

class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = '9';

    // convert char variables to int
    // Use parseInt()
    int num1 = Integer.parseInt(String.valueOf(a));
    int num2 = Integer.parseInt(String.valueOf(b));

    // print numeric value
    System.out.println(num1);    // 5
    System.out.println(num2);    // 9
  }
}

/*
Notice the expression,

Integer.parseInt(String.valueOf(a))
*/
