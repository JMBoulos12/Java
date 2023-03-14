



/*
  In the above example, we have created a string named str. Notice the line,

  str = str.replace(",", ".");
  Here, the replace() method replaces the comma present in the string with the dot character.
  
  We then used the parseDouble() method to convert the string into double.
  
  14-March-2023
*/


class Main {
  public static void main(String[] args) {

    // create string variables
    String str = "614,33";

    // replace the , with .
    str = str.replace(",", ".");

    // convert String to double
    // using valueOf()
    double value = Double.parseDouble(str);

    // print double value
    System.out.println(value);    // 614.33
  }
}
