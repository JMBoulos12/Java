



/*
  In this program, 'i' is stored in a char variable ch. In Java, you use double quotes (" ") for strings and single quotes (' ') for characters.

  Now, to check whether ch is vowel or not, we check if ch is any of: ('a', 'e', 'i', 'o', 'u'). This is done using a simple if..else statement.

  We can also check for vowel or consonant using a switch statement in Java.

  09-March-2023
*/


public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}

/*
Output  :

i is vowel
*/
