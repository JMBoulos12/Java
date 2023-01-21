




/*
  This is a simulation problem. Because the problem guarantees that it is always possible to win, we know that our input will never contain 2 consecutive thunderclouds. 
  To reach the last cloud in a minimum number of steps, always try make a jump from i to i+2. 
  If that is not possible, jump to i+1. 
  
  The Problem Setter's solution below uses this approach. Check out the Problem Tester's solution for a slightly different approach using dynamic programming.
  
  21-January-2023
*/

public static int jumpingOnClouds(List<Integer> c) {
  int count=0,i=0;
  while(i<c.size()-1){
    if(i==c.size()-3){
      i=i+2;
    }else if(i==c.size()-2 || c.get(i+2)==1){
      //If Found thundercloud be carefull 
      i++;
    }else if(c.get(i+2)==0){
      i+=2;
    }  
    //Counting Jumps
    count++;
  }
  return count;
}
