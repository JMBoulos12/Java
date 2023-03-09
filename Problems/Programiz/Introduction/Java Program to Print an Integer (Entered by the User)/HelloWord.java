



/*
  In this program, an object of Scanner class, reader  is created to take inputs from standard input, which is keyboard.
  
  Then, Enter a number prompt is printed to give the user a visual cue as to what they should do next.
  reader.nextInt()then reads all entered integers from the keyboard unless it encounters a new line character \n (Enter). 
  The entered integers are then saved to the integer variable number.
  
  If you enter any character which is not an integer, the compiler will throw an InputMismatchException.
  
  Finally, number is printed onto the standard output (System.out) - computer screen using the function println().
  
  09-March-2023
*/


import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}

/*
OUTPUT :
Enter a number: 10
You entered   : 10
*/
