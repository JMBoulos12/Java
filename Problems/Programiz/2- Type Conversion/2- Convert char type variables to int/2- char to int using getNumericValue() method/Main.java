



/*
  We can also use the getNumericValue() method of the Character class to convert the char type variable into int type.
  
  Here, as we can see the getNumericValue() method returns the numeric value of the character. 
  The character '5' is converted into an integer 5 and the character '9' is converted into an integer 9.
  
  10-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = '9';

    // convert char variables to int
    // Use getNumericValue()
    int num1 = Character.getNumericValue(a);
    int num2 = Character.getNumericValue(b);

    // print the numeric value of characters
    System.out.println(num1);    // 5
    System.out.println(num2);    // 9
  }
}
