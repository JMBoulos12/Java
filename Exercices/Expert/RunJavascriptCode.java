




/*
  Create a method that takes JavaScript code and returns the output of that code.

  Examples :
  runJS("3*3/2") ➞ 4.5

  String code="
    var a=10;
    var b=20;
    isGreater(a, b);
    function isGreater(a, b) {
      return a>b
    }";
  runJS(code) ➞ false

  runJS("var =13") ➞ "Error at line:1 col:4"

  23-January-2023
*/

import javax.script.*;
public class Challange {
  public static Object runJS(String c) {
    ScriptEngine s=new ScriptEngineManager().getEngineByName("JS");
    try {
      return s.eval(c);
    } catch (Exception e) {
      String[] o=e.toString().replaceAll(".*\n|[^\\d]"," ").split(" +");
      return "Error at line:" + o[1] + " col:" + o[2];
    }
  }	
}
