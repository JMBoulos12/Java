



/*
  In the above program, we have a char array ch containing vowels. 
  We use String's valueOf() method again to convert the character array to String.

  We can also use the String constructor which takes character array ch as the parameter for conversion.
  
  If you have a char array instead of just a char, we can easily convert it to String using String methods as follows:

  10-March-2023
*/

public class CharString {

    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
    }
}

/*
Output  :
  aeiou
  aeiou
*/
