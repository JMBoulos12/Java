



/*
  In this program, we have a character stored in the variable ch. 
  We use the Character class's toString() method to convert character to the string st.
  
  Alternatively, we can also use String's valueOf() method for conversion. However, both internally are the same.
  
  10-March-2023
*/


public class CharString {

    public static void main(String[] args) {
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
    }
}

/*
Output  :
The string is: c
*/
