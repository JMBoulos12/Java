



/*
  In this program, the length of the given string, str, is found using the string method length().

  We loop through each character in the string using charAt() function which takes the index (i) and returns the character in the given index.

  We compare each character to the given character ch. If it's a match, we increase the value of frequency by 1.

  In the end, we get the total occurrence of a character stored in frequency and print it.

  09-March-2023
*/


public class Frequency {

    public static void main(String[] args) {
        String str = "This website is awesome.";
        char ch = 'e';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}

/* 
Output  :

Frequency of e = 4
*/
