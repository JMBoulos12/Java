



/*
  In this program, you'll learn to find and display the ASCII value of a character in Java. 
  This is done using type-casting and normal variable assignment operations.
  
  Character a is stored in a char variable, ch. Like, double quotes (" ") are used to declare strings, 
  we use single quotes (' ') to declare characters.

  Now, to find the ASCII value of ch, we just assign ch to an int variable ascii. 
  Internally, Java converts the character value to an ASCII value.

  We can also cast the character ch to an integer using (int). 
  In simple terms, casting is converting variable from one type to another, here char variable ch is converted to an int variable castAscii.

  Finally, we print the ascii value using the println() function.

  09-March-2023
*/


ublic class AsciiValue {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}

/*
Output  :
The ASCII value of a is: 97
The ASCII value of a is: 97
*/
