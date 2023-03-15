



/*
  Output
  a b c d e f g h i j k l m n o p q r s t u v w x y z 
  
  You simply replace A with a and Z with z to display the lowercase alphabets. In this case, internally you loop through 97 to 122.

  15-March-2023
*/


class Main {
  public static void main(String[] args) {

    char c;

    for(c = 'a'; c <= 'z'; ++c)
      System.out.print(c + " ");
    }
}
