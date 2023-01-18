

/*
  Input given statements.
  18-January-2023
  OUTPUT IMAGE : http://lyksoomu.com/xGvH
*/

import java.io.Console;

public class ConsolePrac {
  public static void main(String[] args) {
    Console consoleObj = null;
    try {
      consoleObj = System.console();
      if (consoleObj != null) {
        String person = consoleObj.readLine("Please enter your Name: ");
        System.out.println("Welcome " + person);
        System.out.println("Please check the below  result");
        String fmt = "%2$8s %1$10s %3$3s%n";
        consoleObj.format(fmt, "Name", "RollNo", "MArks");
        consoleObj.format(fmt, "-----", "-----", "-----");
        consoleObj.format(fmt, "Raj", "1212", "75");
        consoleObj.printf(fmt, "Meeta", "1213", "67");
        consoleObj.printf(fmt, "Sanjana", "1215", "89");
        consoleObj.printf(fmt, "Pawan", "1214", "80");
      }
      consoleObj.flush();
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
