



/*
  In this program, we have created

  * a null string str1
  * an empty string str2
  * a string with white spaces str3
  * method isNullEmpty() to check if a string is null or empty
  
  Here, str3 only consists of empty spaces. However, the program doesn't consider it an empty string.

  This is because white spaces are treated as characters in Java and the string with white spaces is a regular string.

  Now, if we want the program to consider strings with white spaces as empty strings, we can use the trim() method. 
  The method removes all the white spaces present in a string.

  10-March-2023
*/


class Main {
  public static void main(String[] args) {
    
    // create null, empty, and regular strings
    String str1 = null;
    String str2 = "";
    String str3 = "  ";

    // check if str1 is null or empty
    System.out.println("str1 is " + isNullEmpty(str1));

    // check if str2 is null or empty
    System.out.println("str2 is " + isNullEmpty(str2));

    // check if str3 is null or empty
    System.out.println("str3 is " + isNullEmpty(str3));
  }

  // method check if string is null or empty
  public static String isNullEmpty(String str) {

    // check if string is null
    if (str == null) {
      return "NULL";
    }

    // check if string is empty
    else if(str.isEmpty()){
      return "EMPTY";
    }

    else {
      return "neither NULL nor EMPTY";
    }
  }
}

/*
Output  :

str1 is NULL
str2 is EMPTY
str3 is neither NULL nor EMPTY
*/
