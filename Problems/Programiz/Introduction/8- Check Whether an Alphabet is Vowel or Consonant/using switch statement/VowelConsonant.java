



/*
  In this program, instead of using a long if condition, we replace it with a switch case statement.
  
  If ch is either of cases: ('a', 'e', 'i', 'o', 'u'), vowel is printed. Else, default case is executed and consonant is printed on the screen.
  
  09-March-2023
*/


public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}

/*
Output  :

z is consonant
*/
