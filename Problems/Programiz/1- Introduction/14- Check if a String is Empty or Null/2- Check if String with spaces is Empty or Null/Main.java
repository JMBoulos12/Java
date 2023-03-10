



/*
  In this example, notice the condition to check empty string

  else if (str.trim().isEmpty())
  
  Here, we have used the trim() method before isEmpty(). This will

  * remove all the white spaces present inside the string
  * check if the string is empty
  
  Hence, we get str is EMPTY as output.

  10-March-2023
*/


class Main {
  public static void main(String[] args) {
    
    // create a string with white spaces
    String str = "    ";

    // check if str1 is null or empty
    System.out.println("str is " + isNullEmpty(str));
  }

  // method check if string is null or empty
  public static String isNullEmpty(String str) {

    // check if string is null
    if (str == null) {
      return "NULL";
    }

    // check if string is empty
    else if (str.trim().isEmpty()){
      return "EMPTY";
    }

    else {
      return "neither NULL nor EMPTY";
    }
  }
}

/*
Output  :

str is EMPTY
*/
