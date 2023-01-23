




/*
  In Nico Cipher, encoding is done by creating a numeric key and assigning each letter position of the message with the provided key.

  Create a function that takes two arguments, message and key, and returns the encoded message.

  There are some variations on the rules of encipherment. One version of the cipher rules are outlined below:

  message = "mubashirhassan"
  key = "crazy"

  nicoCipher(message, key) ➞ "bmusarhiahass n"
  
  Step 1: Assign numbers to sorted letters from the key:
  "crazy" = 23154
  
  Step 2: Assign numbers to the letters of the given message:
  
  2 3 1 5 4
  ---------
  m u b a s
  h i r h a
  s s a n
  Step 3: Sort columns as per assigned numbers:

  1 2 3 4 5
  ---------
  b m u s a
  r h i a h
  a s s   n
  
  Step 4: Return encoded message Rows-wise:

  eMessage = "bmusarhiahass n"
  
  Examples :
  nicoCipher("myworldevolvesinhers", "tesh") ➞ "yowmledrovlvsnieesrh"

  nicoCipher("andiloveherso", "tesha") ➞ "lnidaevheo s or"

  nicoCipher("mubashirhassan", "crazy") ➞ "bmusarhiahass n"

  nicoCipher("edabitisamazing", "matt") ➞ "deabtiismaaznig "

  nicoCipher("iloveher", "612345") ➞ "lovehir    e"
  
  Notes :
  Keys will have alphabets or numbers only.
  
  23-January-2023
*/

import java.util.stream.*;
public class MessageEncrypt {
  public static String nicoCipher(String m, String k) {
    String x = "", w = k.chars().sorted().mapToObj(c -> (char)c+"").collect(Collectors.joining(""));
    for (int i = 0; i < w.length(); i++) {
      int e = k.indexOf(w.charAt(i)+"");
      x += x.contains(e+"") ? k.lastIndexOf(w.charAt(i)+"") : e; 
    }
    m = m.length() % k.length() > 0 ? m + new String(new char[k.length()-(m.length() % k.length())]).replace("\0", " "): m; 
    String[] t = m.split("(?<=\\G.{" + k.length() + "})");
    for (int n = 0; n < t.length; n++) {
      char[] s = new char[k.length()];
    	for (int i = 0; i < s.length; i++) s[i] = t[n].charAt(Integer.parseInt(x.charAt(i)+""));
      t[n] = Stream.of(s).map(c -> String.valueOf(c)).collect(Collectors.joining("")); 
    }
    return String.join("", t);
  }
}
