



/*
  Output
  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
  
  You can loop through A to Z using for loop because they are stored as ASCII characters in Java.

  So, internally, you loop through 65 to 90 to print the English alphabets.

  With a little modification, you can display lowercase alphabets as shown in the example below.

  15-March-2023
*/


class Main {
  public static void main(String[] args) {

    char c;

    for(c = 'A'; c <= 'Z'; ++c)
      System.out.print(c + " ");
    }
}
