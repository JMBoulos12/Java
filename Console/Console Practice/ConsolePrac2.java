


/*
  Enter data
  18-January-2023
  OUTPUT IMAGE : http://lyksoomu.com/xH3F
*/

import java.io.Console
import java.util.Scanner;
import java.io.PrintWriter;

public class ConsolePrac {
  public static void main(String[] args) {
    Console consoleObj = null;
    PrintWriter PWObj = null;
    String fmt1 = "%1$6s %2$5s %3$10s%n";
    String fmt2 = "%1$8s %2$10s %3$5s %4$5s %5$10s%n";
    Scanner scanObj = null;
    try {
      consoleObj = System.console();
      if (consoleObj != null) {
        System.out.print("Please enter your Name: ");
        scanObj = new Scanner(consoleObj.reader());
        String person = scanObj.next();
        String empID = consoleObj.readLine(fmt1, "Please","enter","EmployeeID: ");
        char[] pwd = consoleObj.readPassword("Please enter your Password: ");
        char[] ans1 = consoleObj.readPassword(fmt2,"Security","question- ","Enter","your","Mothers'name: ");
        PWObj = consoleObj.writer();
        PWObj.println("Welcome "+person +" "+empID);
      }
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
