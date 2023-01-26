




/*
  Write a recursive function that will return the longest word in a sentence. 
  In cases where more than one word is found, return the first one.

  Examples  :
  findLongest("I will and ever will be gratefully and perpetually loving you Tesh!😘") ➞ "perpetually"
  findLongest("A thing of beauty is a joy forever.") ➞ "forever"
  findLongest("Forgetfulness is by all means powerless!") ➞ "forgetfulness"
  findLongest("The word strengths is the longest and most commonly used word with a single vowel.") ➞ "strengths"
  .
  Notes :
  * Special characters and symbols don't count as part of the word.
  * Return the longest word found in lowercase letters.
  * You are expected to solve this challenge via a recursive approach. 

  26-January-2023
*/

import java.util.*;
import java.util.stream.Collectors;

public class WordsInSentence {
  public static String findLongest(String str) {
    String s = str.replaceAll("[^a-zA-Z]", " ");
    System.out.println(s);
    String[] split = s.split(" ");
    List<String> ls = Arrays.asList(split);
    List<String> collect = ls.stream().sorted(Comparator.comparingInt(String::length))
      .collect(Collectors.toList());
    int max=collect.get(collect.size()-1).length();
    List<String> collect1 = collect.stream().filter(x -> x.length() == max).collect(Collectors.toList());
    System.out.println(collect1);
    return collect1.get(0).toLowerCase();
  }
}
