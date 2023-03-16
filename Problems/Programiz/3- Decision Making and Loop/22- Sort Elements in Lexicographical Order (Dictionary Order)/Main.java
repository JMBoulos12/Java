



/*
  Output  :
  In lexicographical order:
  C
  Java
  Python
  Ruby

  16-March-2023
*/


class Main {
  public static void main(String[] args) {

    String[] words = { "Ruby", "C", "Python", "Java" };

    for(int i = 0; i < 3; ++i) {
      for (int j = i + 1; j < 4; ++j) {
          
        if (words[i].compareTo(words[j]) > 0) {

          // swap words[i] with words[j[
          String temp = words[i];
          words[i] = words[j];
          words[j] = temp;
        }
      }
    }

    System.out.println("In lexicographical order:");
    
    for(int i = 0; i < 4; i++) {
      System.out.println(words[i]);
    }
  }
}
