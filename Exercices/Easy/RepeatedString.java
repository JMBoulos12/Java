




/*
  There is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer, n. 
  Find and print the number of letter a's in the first n letters of the infinite string. 
  
  21-January-2023
*/

public static long repeatedString(String s, long n) {
  // Counting no. of 'a' in given String
  long count=s.chars().filter(i-> i=='a').count();
  // Counting no. of 'a' in length n/s.len
  long countA= (n/s.length())*count;
  long r=n%s.length();
  String newS="";
    
  //If there is any reminder then add that(r) no. of characters in new String(new S)
  for(int i=0;i<r;i++){
    newS=newS+s.charAt(i);
  }
  //Counting and adding no. of 'a' in new String(newS) to countA
  countA=countA+newS.chars().filter(i->i=='a').count();
  return countA;
}
