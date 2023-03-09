



/*
  In this program, instead of using temporary variable, we use simple mathematics to swap the numbers.
  
  09-March-2023
*/


public class SwapNumbers {

    public static void main(String[] args) {

        float first = 12.0f, second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

/*
Output:
--Before swap--
First number = 12.0
Second number = 24.5
--After swap--
First number = 24.5
Second number = 12.0

For the operation, storing (first - second) is important. This is stored in variable first.

first = first - second;
first = 12.0f - 24.5f

Then, we just add second (24.5f) to this number - calculated first (12.0f - 24.5f) to swap the number.
second = first + second;
second = (12.0f - 24.5f) + 24.5f = 12.0f

Now, second holds 12.0f (which was initially value of first). So, we subtract calculated first (12.0f - 24.5f) from swapped second (12.0f) to get the other swapped number.
first = second - first;
first = 12.0f - (12.0f - 24.5f) = 24.5f

The swapped numbers are printed on the screen using println().
*/
